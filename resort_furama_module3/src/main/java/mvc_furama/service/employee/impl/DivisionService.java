package mvc_furama.service.employee.impl;

import mvc_furama.model.employee.Division;
import mvc_furama.repository.employee.IDivisionRepository;
import mvc_furama.repository.employee.impl.DivisionRepository;
import mvc_furama.service.employee.IDivisionService;

import java.util.List;

public class DivisionService implements IDivisionService {
    private final IDivisionRepository divisionRepository = new DivisionRepository();

    @Override
    public List<Division> getAllDivision() {
        return this.divisionRepository.getAllDivision();
    }
}
