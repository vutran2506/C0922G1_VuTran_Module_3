package students.service.impl;

import students.model.Student;
import students.repository.IStudentRepository;
import students.repository.impl.StudentRepository;
import students.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private  final IStudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> selectAllStudent() {
        return this.studentRepository.selectAllStudent();
    }

    @Override
    public Student selectStudentById(int id) {
        return this.studentRepository.selectStudentById(id);
    }

    @Override
    public boolean insertStudent(Student student) {
        return this.studentRepository.insertStudent(student);
    }

    @Override
    public boolean updateStudent(int id, Student student) {
        return this.studentRepository.updateStudent(id,student);
    }

    @Override
    public boolean deleteStudent(int id) {
        return this.studentRepository.deleteStudent(id);
    }
}
