package repository;

import model.HocSinh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HocSinhRepository implements  IHocsinhRepository{
    public final String SELECT = "select*from hoc_sinh";

    @Override
    public List<HocSinh> getAllHocSinh() {
        List<HocSinh> hocSinhList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String mahocSinh = resultSet.getString("ma_hoc_sinh");
                String hoTen = resultSet.getString("ho_ten");
                String lop = resultSet.getString("lop");
                HocSinh hocSinh = new HocSinh(mahocSinh,hoTen);
                hocSinhList.add(hocSinh);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hocSinhList;
    }
}
