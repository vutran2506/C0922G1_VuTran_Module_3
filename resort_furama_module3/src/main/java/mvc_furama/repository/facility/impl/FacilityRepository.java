package mvc_furama.repository.facility.impl;

import mvc_furama.model.Facikity.Facility;
import mvc_furama.model.Facikity.FacilityType;
import mvc_furama.model.Facikity.RentType;
import mvc_furama.repository.BaseRepository;
import mvc_furama.repository.facility.IFacilityRepository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements IFacilityRepository {
   private final String SELECT_ALL ="select f.* ,r.name as rent_type , ft.name as facility_type from facility f \n" +
           "join rent_type r  on f.rent_type_id = r.rent_type_id\n" +
           "join facility_type ft on f.facility_type_id =ft.facility_type_id";
   private final String DELETE ="delete from facility where facility_id = ?";
    @Override
    public List<Facility> selectAll() {
        List< Facility> facilityList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){

                int id = resultSet.getInt("facility_id");
                String name =  resultSet.getString("name");
                int area = resultSet.getInt("area");
                double cost = resultSet.getDouble("cost");
                int maxPeople = resultSet.getInt("max_people");
                int rentId = resultSet.getInt("rent_type_id");
                int facilityId =  resultSet.getInt("facility_type_id");
                String standardRoom = resultSet.getString("standard_room");
                String description = resultSet.getString("description_other_convenience");
                double poolArea = resultSet.getDouble("pool_area");
                int numberFloors = resultSet.getInt("number_of_floors");
                String facilityFree = resultSet.getString("facility_free");


                String nameRent = resultSet.getString("rent_type");
                String nameFacilityType = resultSet.getString("facility_type");

                FacilityType facilityType = new FacilityType(facilityId,nameFacilityType);
                RentType rentType = new RentType(rentId,nameRent);

                Facility facility = new Facility(id,name,area,cost,maxPeople,rentType,facilityType,standardRoom,description,poolArea,numberFloors,facilityFree);
                facilityList.add(facility);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return facilityList;
    }

    @Override
    public Facility selectById() {
        return null;
    }

    @Override
    public boolean deleteFacility(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1,id);
           return preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateFacility(int id, Facility facility) {
        return false;
    }

    @Override
    public boolean insertFacility(Facility facility) {
        return false;
    }

    @Override
    public List<Facility> selectByName(String name) {
        return null;
    }
}
