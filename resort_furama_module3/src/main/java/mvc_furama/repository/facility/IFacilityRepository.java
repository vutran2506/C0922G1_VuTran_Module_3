package mvc_furama.repository.facility;

import mvc_furama.model.facility.Facility;

import java.util.List;

public interface IFacilityRepository {
    List<Facility> selectAll();
    Facility selectById();
    boolean deleteFacility(int id);
    boolean updateFacility(int id,Facility facility);
    boolean insertFacility(Facility facility);
    List<Facility> selectByName(String name);
}
