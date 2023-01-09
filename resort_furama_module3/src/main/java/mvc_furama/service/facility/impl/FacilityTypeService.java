package mvc_furama.service.facility.impl;

import mvc_furama.model.Facikity.FacilityType;

import mvc_furama.repository.facility.IFacilityTypeRepository;

import mvc_furama.repository.facility.impl.FacilityTypeRepository;
import mvc_furama.service.facility.IFacilityTypeService;

import java.util.List;

public class FacilityTypeService implements IFacilityTypeService {
    private IFacilityTypeRepository facilityRepository = new FacilityTypeRepository();
    @Override
    public List<FacilityType> listFacilityType() {
        return this.facilityRepository.listFacilityType();
    }
}
