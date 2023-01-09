package mvc_furama.repository.facility.impl;

import mvc_furama.model.Facikity.FacilityType;
import mvc_furama.model.Facikity.RentType;
import mvc_furama.repository.BaseRepository;
import mvc_furama.repository.facility.IRentTypeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RentTypeRepository implements IRentTypeRepository {
    @Override
    public List<RentType> listRentType() {
        List<RentType> rentTypes = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(" select*from rent_type ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int rentId = resultSet.getInt("rent_type_id");
                String nameRent = resultSet.getString("name");
                RentType rentType = new RentType(rentId, nameRent);
                rentTypes.add(rentType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rentTypes;

    }
}
