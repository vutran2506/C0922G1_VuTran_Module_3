package mvc_furama.repository.employee.impl;

import mvc_furama.model.employee.Division;
import mvc_furama.model.employee.Education;
import mvc_furama.model.employee.Employee;
import mvc_furama.model.employee.Position;
import mvc_furama.repository.BaseRepository;
import mvc_furama.repository.employee.IEmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public  final  String SELECT_ALL = "select e.* ,ed.name as name_education ,p.name as name_position ,d.name name_division from employee e\n" +
            "  join education_degree ed on e.education_degree_id = ed.education_degree_id\n" +
            "  join division d on e.division_id = d.division_id\n" +
            "  join positions p on  e.position_id = p.position_id";
    @Override
    public List<Employee> selectAll() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("employee_id");
                String name =  resultSet.getString("name");
                Date dateOfBirth = resultSet.getDate("date_of_birth");
                String idCard= resultSet.getString("id_card");
                double salary = resultSet.getDouble("salary");
                String phone = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                int idPosition = resultSet.getInt("position_id");
                int idEducation = resultSet.getInt("education_degree_id");
                int idDivision = resultSet.getInt("division_id");
                String namePosition = resultSet.getString("name_position");
                String nameEducation = resultSet.getString("name_education");
                String nameDivision = resultSet.getString("name_division");
                Position position = new Position(idPosition,namePosition);
                Education education = new Education(idEducation, nameEducation);
                Division division = new Division(idDivision,nameDivision);
                Employee employee = new Employee(id,name,dateOfBirth,idCard,salary,phone,email,address,position,education,division);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public Employee selectEmployee(int id) {
        return null;
    }

    @Override
    public boolean deleteEmployee(int id) {
        return false;
    }

    @Override
    public boolean updateEmployee(int id, Employee employee) {
        return false;
    }

    @Override
    public boolean insertEmployee(Employee employee) {
        return false;
    }

    @Override
    public List<Employee> searchEmployee(String name) {
        return null;
    }
}
