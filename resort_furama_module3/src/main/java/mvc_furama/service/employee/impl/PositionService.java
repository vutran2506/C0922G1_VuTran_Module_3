package mvc_furama.service.employee.impl;

import mvc_furama.model.employee.Position;
import mvc_furama.repository.employee.IPositionRepository;
import mvc_furama.repository.employee.impl.PositionRepository;
import mvc_furama.service.employee.IPositionService;

import java.util.List;

public class PositionService implements IPositionService {
    private final IPositionRepository positionRepository = new PositionRepository();
    @Override
    public List<Position> getAllPosition() {
        return this.positionRepository.getAllPosition();
    }
}
