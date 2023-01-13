package students.service;

import students.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> selectAllStudent();
    Student selectStudentById(int id);
    boolean insertStudent(Student student);
    boolean updateStudent(int id, Student student);
    boolean deleteStudent(int id);
}
