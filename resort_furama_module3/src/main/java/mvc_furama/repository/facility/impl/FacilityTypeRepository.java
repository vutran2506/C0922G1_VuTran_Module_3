package mvc_furama.repository.facility.impl;

import javafx.scene.layout.Background;
import mvc_furama.model.Facikity.FacilityType;
import mvc_furama.model.Facikity.RentType;
import mvc_furama.repository.BaseRepository;
import mvc_furama.repository.facility.IFacilityTypeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacilityTypeRepository implements IFacilityTypeRepository {
    @Override
    public List<FacilityType> listFacilityType() {
        List<FacilityType> facilityTypes = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(" select * from facility_type");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int facilityId =  resultSet.getInt("facility_type_id");
                String nameFacilityType = resultSet.getString("name");
                FacilityType facilityType = new FacilityType(facilityId,nameFacilityType);
                facilityTypes.add(facilityType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return facilityTypes;
    }
}
