package repository;

import model.HocSinh;
import model.MuonSach;
import model.Sach;
import org.omg.PortableInterceptor.ServerRequestInfo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MuonSachRepository implements IMuonSachRepository {
    public final String SELECT_ALL_MUON_SACH = "select t.* ,h.ho_ten, s.ten_sach from the_muon_sach t\n" +
            "join hoc_sinh h on t.ma_hoc_sinh = h.ma_hoc_sinh\n" +
            "join sach s on t.ma_sach = s.ma_sach;";

    @Override
    public List<MuonSach> selectMuonSach() {
        List<MuonSach> muonSachList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_MUON_SACH);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String mathe = resultSet.getString("ma_the");
                String maSach = resultSet.getString("ma_sach");
                String maHocSinh = resultSet.getString("ma_hoc_sinh");
                String trangThai = resultSet.getString("trang_thai");
                Date ngayMuon = resultSet.getDate("ngay_muon");
                Date ngayTra = resultSet.getDate("ngay_tra");
                String tenHocSinh = resultSet.getString("ho_ten");
                String tenSach = resultSet.getString("ten_sach");
                HocSinh hocSinh = new HocSinh(maHocSinh, tenHocSinh);
                Sach sach = new Sach(maSach, tenSach);
                MuonSach muonSach = new MuonSach(maSach, sach, hocSinh, ngayMuon, ngayTra);
                muonSachList.add(muonSach);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return muonSachList;
    }
}
