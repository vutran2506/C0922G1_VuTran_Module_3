package students.service.impl;

import students.model.Clazz;

import students.repository.IClazzRepository;
import students.repository.impl.ClazzRepository;
import students.service.IClazzService;

import java.util.List;

public class ClazzService implements IClazzService {
    private final IClazzRepository clazzRepository = new ClazzRepository();

    @Override
    public List<Clazz> findByAll() {
        return this.clazzRepository.findByAll();
    }
}
