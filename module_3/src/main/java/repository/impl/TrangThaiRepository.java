package repository.impl;

import model.LoaiPhong;
import model.TrangThai;
import repository.BaseRepository;
import repository.ITrangThaiRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrangThaiRepository implements ITrangThaiRepository {
    @Override
    public List<TrangThai> getAllTrangThai() {
        List<TrangThai> trangThaiList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from trang_thai");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int maTrangThai = resultSet.getInt("trang_thai_id");

                String tenTrangThai = resultSet.getString("trang_thai");

                TrangThai trangThai = new TrangThai(maTrangThai,tenTrangThai);
                trangThaiList.add(trangThai);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  trangThaiList;
    }
}
