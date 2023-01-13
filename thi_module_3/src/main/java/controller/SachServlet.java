package controller;

import model.HocSinh;
import model.MuonSach;
import model.Sach;
import repository.HocSinhRepository;
import service.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SachServlet", value = "/Sach")
public class SachServlet extends HttpServlet {
    private final ISachService sachService = new SachService();
    private final IHocSinhService hocSinhService = new HocSinhService();
    private final IMuonSachService muonSachService = new MuonSachService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getParameter("action");
if (action==null){
    action = "";
}
switch (action){
    case "muon":
        showMuonSach(request,response);
        break;
    default:
        showSachForm(request,response);
        break;
}
    }

    private void showMuonSach(HttpServletRequest request, HttpServletResponse response) {
        List<MuonSach> muonSachList =this.muonSachService.selectMuonSach();
        request.setAttribute("muonSachList",muonSachList);
        List<HocSinh> hocSinhList = this.hocSinhService.getAllHocSinh();
        request.setAttribute("hocSinhList",hocSinhList);
        List<Sach> sachList = this.sachService.getAllSach();
        request.setAttribute("sachList",sachList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("muon.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }

    private void showSachForm(HttpServletRequest request, HttpServletResponse response) {
        List<Sach> sachList = this.sachService.getAllSach();
        request.setAttribute("sachList",sachList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
