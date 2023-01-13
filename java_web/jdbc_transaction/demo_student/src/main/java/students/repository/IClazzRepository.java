package students.repository;

import students.model.Clazz;

import java.util.ArrayList;
import java.util.List;

public interface IClazzRepository {
    List<Clazz> findByAll();
}
