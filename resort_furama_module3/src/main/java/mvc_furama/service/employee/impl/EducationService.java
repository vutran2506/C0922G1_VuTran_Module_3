package mvc_furama.service.employee.impl;

import mvc_furama.model.employee.Education;
import mvc_furama.repository.employee.IEducationRepository;
import mvc_furama.repository.employee.impl.EducationRepository;
import mvc_furama.service.employee.IEducationService;

import java.util.List;

public class EducationService implements IEducationService {
    private final IEducationRepository educationRepository = new EducationRepository();
    @Override
    public List<Education> getAllEducation() {
        return this.educationRepository.getAllEducation();
    }
}
