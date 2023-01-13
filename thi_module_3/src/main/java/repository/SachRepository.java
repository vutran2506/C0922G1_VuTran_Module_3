package repository;

import model.Sach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SachRepository implements ISachRepository{
    public  final String SELECT_ALL_SACH = "select*from sach";
    @Override
    public List<Sach> getAllSach() {
        List<Sach> sachList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SACH);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String maSach = resultSet.getString("ma_sach");
                String tenSach = resultSet.getString("ten_sach");
                String tacGia = resultSet.getString("tac_gia");
                int soLuong = resultSet.getInt("so_luong");
                String moTa = resultSet.getString("mo_ta");
                Sach sach = new Sach(maSach,tenSach,tacGia,moTa,soLuong);
                sachList.add(sach);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sachList;
    }
}
