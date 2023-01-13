package model;

import java.sql.Date;

public class Nha {
    private  int id;
    private  String ten;
    private  double dienTich;
    private  int soTang;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private double gia;
    private int idTrangThai;
    private int idLoaiPhong;
    private LoaiPhong loaiPhong;
    private TrangThai trangThai;

    public Nha() {
    }

    public Nha(int id, String ten, double dienTich, int soTang, Date ngayBatDau, Date ngayKetThuc, double gia, LoaiPhong loaiPhong, TrangThai trangThai) {
        this.id = id;
        this.ten = ten;
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.gia = gia;
        this.loaiPhong = loaiPhong;
        this.trangThai = trangThai;
    }

    public Nha(String ten, double dienTich, int soTang, Date ngayBatDau, Date ngayKetThuc, double gia, int idTrangThai, int idLoaiPhong) {
        this.ten = ten;
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.gia = gia;
        this.idTrangThai = idTrangThai;
        this.idLoaiPhong = idLoaiPhong;
    }

    public Nha(int id, String ten, double dienTich, int soTang, Date ngayBatDau, Date ngayKetThuc, double gia, int idTrangThai, int idLoaiPhong) {
        this.id = id;
        this.ten = ten;
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.gia = gia;
        this.idTrangThai = idTrangThai;
        this.idLoaiPhong = idLoaiPhong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getIdTrangThai() {
        return idTrangThai;
    }

    public void setIdTrangThai(int idTrangThai) {
        this.idTrangThai = idTrangThai;
    }

    public int getIdLoaiPhong() {
        return idLoaiPhong;
    }

    public void setIdLoaiPhong(int idLoaiPhong) {
        this.idLoaiPhong = idLoaiPhong;
    }

    public LoaiPhong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(LoaiPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public TrangThai getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThai trangThai) {
        this.trangThai = trangThai;
    }
}
