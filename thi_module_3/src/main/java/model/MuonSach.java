package model;

import java.sql.Date;

public class MuonSach {
    private String maMuonSach ;
    private String maSach;
    private Sach sach;
    private String maHocSinh;
    private HocSinh hocSinh;
    private boolean trangThai;
    private Date ngayMuon;
    private Date ngayTra;

    public MuonSach() {
    }

    public MuonSach(String maMuonSach, Sach sach, HocSinh hocSinh, Date ngayMuon, Date ngayTra) {
        this.maMuonSach = maMuonSach;
        this.sach = sach;
        this.hocSinh = hocSinh;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }

    public MuonSach(String maMuonSach, String maHocSinh, HocSinh hocSinh, Date ngayMuon, Date ngayTra) {
        this.maMuonSach = maMuonSach;
        this.maHocSinh = maHocSinh;
        this.hocSinh = hocSinh;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }

    public String getMaMuonSach() {
        return maMuonSach;
    }

    public void setMaMuonSach(String maMuonSach) {
        this.maMuonSach = maMuonSach;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }
}
