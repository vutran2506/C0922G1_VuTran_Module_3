package repository.impl;

import model.LoaiPhong;
import model.Nha;
import model.TrangThai;
import repository.BaseRepository;
import repository.ILoaiPhongRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoaiPhongRepository implements ILoaiPhongRepository {

    @Override
    public List<LoaiPhong> getAllLoaiPhong() {
        List<LoaiPhong> loaiPhongList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from loai_phong");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){

                int maLoaiPhong = resultSet.getInt("loai_phong_id");

                String tenLoaiPhong = resultSet.getString("loai_phong");

                LoaiPhong loaiPhong = new LoaiPhong(maLoaiPhong,tenLoaiPhong);
                loaiPhongList.add(loaiPhong);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return loaiPhongList;
    }
}
