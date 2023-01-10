package mvc_furama.service.facility.impl;

import mvc_furama.model.facility.Facility;
import mvc_furama.repository.facility.IFacilityRepository;
import mvc_furama.repository.facility.impl.FacilityRepository;
import mvc_furama.service.facility.IFacilityServce;

import java.util.List;

public class FacilityService implements IFacilityServce {
    private final IFacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public List<Facility> selectAll() {
        return this.facilityRepository.selectAll();
    }

    @Override
    public Facility selectById() {
        return null;
    }

    @Override
    public boolean deleteFacility(int id) {
        return this.facilityRepository.deleteFacility(id);
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
