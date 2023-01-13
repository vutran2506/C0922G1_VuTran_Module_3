package repository.impl;

import model.LoaiPhong;
import model.Nha;
import model.TrangThai;
import repository.BaseRepository;
import repository.INhaRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhaRepository implements INhaRepository {
    public final String SELECT_ALL = " select n.* ,l.loai_phong ,t.trang_thai from nha n join loai_phong l on n.loai_phong_id = l.loai_phong_id join  trang_thai t on n.trang_thai_id = t.trang_thai_id";
    public final String DELETE = "delete from nha where ma_so =?";
    public final String INSERT = "insert into nha(ten,dien_tich,so_tang,ngay_bat_dau,ngay_ket_thuc,gia,trang_thai_id,loai_phong_id) values (?,?,?,?,?,?,?,?)";
    public final String SEARCH = "select n.* ,l.loai_phong ,t.trang_thai from nha n join loai_phong l on n.loai_phong_id = l.loai_phong_id join  trang_thai t on n.trang_thai_id = t.trang_thai_id where ten like ? and n.trang_thai_id like ? and n.loai_phong_id like ?";

    @Override
    public List<Nha> selectAllNha() {
        List<Nha> nhaList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int maSo = resultSet.getInt("ma_so");
                String ten = resultSet.getString("ten");
                double dienTich = resultSet.getDouble("dien_tich");
                int soTang = resultSet.getInt("so_tang");
                Date ngayBatDau = resultSet.getDate("ngay_bat_dau");
                Date ngayKetThuc = resultSet.getDate("ngay_ket_thuc");
                double gia = resultSet.getDouble("gia");
                int maLoaiPhong = resultSet.getInt("loai_phong_id");
                int maTrangThai = resultSet.getInt("trang_thai_id");
                String tenLoaiPhong = resultSet.getString("loai_phong");
                String tentrangThai = resultSet.getString("trang_thai");
                LoaiPhong loaiPhong = new LoaiPhong(maLoaiPhong, tenLoaiPhong);
                TrangThai trangThai = new TrangThai(maTrangThai, tentrangThai);
                Nha nha = new Nha(maSo, ten, dienTich, soTang, ngayBatDau, ngayKetThuc, gia, loaiPhong, trangThai);
                nhaList.add(nha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nhaList;
    }

    @Override
    public Nha selectNha(int id) {
        return null;
    }

    @Override
    public boolean insertNha(Nha nha) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, nha.getTen());
            preparedStatement.setDouble(2, nha.getDienTich());
            preparedStatement.setInt(3, nha.getSoTang());
            preparedStatement.setDate(4, nha.getNgayBatDau());
            preparedStatement.setDate(5, nha.getNgayKetThuc());
            preparedStatement.setDouble(6, nha.getGia());
            preparedStatement.setInt(7, nha.getIdTrangThai());
            preparedStatement.setInt(8, nha.getIdLoaiPhong());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteNha(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean editNha(int id, Nha nha) {
        return false;
    }

    @Override
    public List<Nha> search(String name, int tenLoaiPhong, int tenTrangThai) {
        List<Nha> nhaList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH);
            preparedStatement.setString(1, "%" + name + "%");
            preparedStatement.setInt(2,tenTrangThai);
            preparedStatement.setInt(3,tenLoaiPhong);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int maSo = resultSet.getInt("ma_so");
                String ten = resultSet.getString("ten");
                double dienTich = resultSet.getDouble("dien_tich");
                int soTang = resultSet.getInt("so_tang");
                Date ngayBatDau = resultSet.getDate("ngay_bat_dau");
                Date ngayKetThuc = resultSet.getDate("ngay_ket_thuc");
                double gia = resultSet.getDouble("gia");
                int maLoaiPhong = resultSet.getInt("loai_phong_id");
                int maTrangThai = resultSet.getInt("trang_thai_id");
                String tenLoaiPhong1 = resultSet.getString("loai_phong");
                String tentrangThai = resultSet.getString("trang_thai");
                LoaiPhong loaiPhong = new LoaiPhong(maLoaiPhong, tenLoaiPhong1);
                TrangThai trangThai = new TrangThai(maTrangThai, tentrangThai);
                Nha nha = new Nha(maSo, ten, dienTich, soTang, ngayBatDau, ngayKetThuc, gia, loaiPhong, trangThai);
                nhaList.add(nha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhaList;
    }
}
