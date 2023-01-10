package mvc_furama.service.facility.impl;

import mvc_furama.model.facility.RentType;
import mvc_furama.repository.facility.IRentTypeRepository;
import mvc_furama.repository.facility.impl.RentTypeRepository;
import mvc_furama.service.facility.IRentTypeService;

import java.util.List;

public class RentTypeService implements IRentTypeService {
    private IRentTypeRepository rentTypeRepository = new RentTypeRepository();
    @Override
    public List<RentType> listRentType() {
        return this.rentTypeRepository.listRentType();
    }


}
