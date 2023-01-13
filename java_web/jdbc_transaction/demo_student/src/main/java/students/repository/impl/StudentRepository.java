package students.repository.impl;

import students.model.Clazz;
import students.model.Student;
import students.repository.IStudentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final String SELECT_ALL = "select s.*,c.class_name FROM student s join clazz c on s.class_id=c.class_id;";
    private final String SELECT_BY_ID = "select s.*, c.class_name from student s join clazz c on s.class_id = c.class_id where id = ?";
    private final String DELETE_STUDENT = "delete from student where id =?";
    private final String INSERT_STUDENT = "insert into student(name,gender,point,class_id)values(?,?,?,?)";
    private final String EDIT_STUDENT = "update student set name = ?, gender = ?, point = ?,class_id =? where id = ?";


    @Override
    public List<Student> selectAllStudent() {
        List<Student> studentList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                boolean gender = resultSet.getBoolean("gender");
                int point = resultSet.getInt("point");
                int class_id = resultSet.getInt("class_id");
                String class_name = resultSet.getString("class_name");
                Clazz clazz = new Clazz(class_id, class_name);
                Student student = new Student(id, name, gender, point, clazz);
                studentList.add(student);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    @Override
    public Student selectStudentById(int id) {
        return null;
    }


    @Override
    public boolean insertStudent(Student student) {
        return false;
    }


    @Override
    public boolean updateStudent(int id, Student student) {
        return false;
    }

    @Override
    public boolean deleteStudent(int id) {
        return false;
    }
}
