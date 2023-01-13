package model;

public class Sach {
    private String maSach;
    private String ten;
    private String tacGia;
    private String moTa;
    private int soLuong;

    public Sach() {
    }

    public Sach(String maSach, String ten, String tacGia, String moTa, int soLuong) {
        this.maSach = maSach;
        this.ten = ten;
        this.tacGia = tacGia;
        this.moTa = moTa;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Sach(String maSach, String ten) {
        this.maSach = maSach;
        this.ten = ten;
    }
}
