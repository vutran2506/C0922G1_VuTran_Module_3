package mvc_furama.repository.employee;

import mvc_furama.model.employee.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> selectAll();
    Employee selectEmployee(int id);
    boolean deleteEmployee(int id);
    boolean updateEmployee(int id,Employee employee);
    boolean insertEmployee(Employee employee);
    List<Employee> searchEmployee(String name);
}
