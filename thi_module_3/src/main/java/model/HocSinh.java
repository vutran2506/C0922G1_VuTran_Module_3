package model;

public class HocSinh {
    private String maHocSinh;
    private String  hoTen;
    private String lop;

    public HocSinh() {
    }

    public HocSinh(String maHocSinh, String hoTen, String lop) {
        this.maHocSinh = maHocSinh;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public HocSinh(String maHocSinh, String hoTen) {
        this.maHocSinh = maHocSinh;
        this.hoTen = hoTen;
    }
}
