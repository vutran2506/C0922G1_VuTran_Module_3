package com.example.module_3.controller;

import model.LoaiPhong;
import model.Nha;
import model.TrangThai;
import service.ILoaiPhongService;
import service.INhaService;
import service.ITrangThaiService;
import service.impl.LoaiPhongService;
import service.impl.NhaService;
import service.impl.TrangThaiService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet(name = "NhaServlet", value = "/nha")
public class NhaServlet extends HttpServlet {
    private final INhaService nhaService = new NhaService();
    private final ILoaiPhongService loaiPhongService = new LoaiPhongService();

    private final ITrangThaiService trangThaiService = new TrangThaiService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showwCreateNhaForm(request, response);
                break;
            default:
                showNhaForm(request, response);
                break;
        }
    }

    private void showwCreateNhaForm(HttpServletRequest request, HttpServletResponse response) {
        List<LoaiPhong> loaiPhongList = this.loaiPhongService.getAllLoaiPhong();
        request.setAttribute("loaiPhongList", loaiPhongList);

        List<TrangThai> trangThaiList = this.trangThaiService.getAllTrangThai();
        request.setAttribute("trangThaiList", trangThaiList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showNhaForm(HttpServletRequest request, HttpServletResponse response) {

        List<LoaiPhong> loaiPhongList = this.loaiPhongService.getAllLoaiPhong();
        request.setAttribute("loaiPhongList", loaiPhongList);
        List<TrangThai> trangThaiList = this.trangThaiService.getAllTrangThai();
        request.setAttribute("trangThaiList", trangThaiList);
        List<Nha> nhaList = this.nhaService.selectAllNha();
        request.setAttribute("nhaList", nhaList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createNha(request, response);
                break;
            case "delete":
                deleteNha(request, response);
                break;
            case "search":
                searchNha(request,response);
                break;
            default:
                break;
        }
    }

    private void searchNha(HttpServletRequest request, HttpServletResponse response) {
        String ten = request.getParameter("ten");
        int loaiPhong = Integer.parseInt(request.getParameter("loaiPhong"));
        int trangThai = Integer.parseInt(request.getParameter("trangThai"));
        List<Nha> nhaList =this.nhaService.search(ten,loaiPhong,trangThai);
        request.setAttribute("nhaList",nhaList);
        List<LoaiPhong> loaiPhongList = this.loaiPhongService.getAllLoaiPhong();
        request.setAttribute("loaiPhongList", loaiPhongList);
        List<TrangThai> trangThaiList = this.trangThaiService.getAllTrangThai();
        request.setAttribute("trangThaiList", trangThaiList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }


    }

    private void createNha(HttpServletRequest request, HttpServletResponse response) {
        String ten = request.getParameter("ten");
        double dienTich = Double.parseDouble(request.getParameter("dienTich"));
        int soTang = Integer.parseInt(request.getParameter("soTang"));
        Date ngayBatDau = Date.valueOf(request.getParameter("ngayBatDau"));
        Date ngayKetThuc = Date.valueOf(request.getParameter("ngayKetThuc"));
        double gia = Double.parseDouble(request.getParameter("gia"));
        int trangThai = Integer.parseInt(request.getParameter("trangThai"));
        int loaiPhong = Integer.parseInt(request.getParameter("loaiPhong"));
        Nha nha = new Nha(ten, dienTich, soTang, ngayBatDau, ngayKetThuc, gia, trangThai, loaiPhong);
       boolean check = this.nhaService.insertNha(nha);
        String mess ="Thêm mới thành công";
        if (!check){
            mess= "Thêm mới không thành công";
        }
        request.setAttribute("mess", mess);
        showNhaForm(request, response);
    }

    private void deleteNha(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
       boolean check= this.nhaService.deleteNha(id);
        String mess ="Xoá thành công";
        if (!check){
            mess= "Xoá không thành công";
        }
        request.setAttribute("mess", mess);
        showNhaForm(request, response);
    }
}
