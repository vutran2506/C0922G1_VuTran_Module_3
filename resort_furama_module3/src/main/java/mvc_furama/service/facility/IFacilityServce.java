package mvc_furama.service.facility;

import mvc_furama.model.Facikity.Facility;

import java.util.List;

public interface IFacilityServce {
    List<Facility> selectAll();
    Facility selectById();
    boolean deleteFacility(int id);
    boolean updateFacility(int id,Facility facility);
    boolean insertFacility(Facility facility);
    List<Facility> selectByName(String name);
}
