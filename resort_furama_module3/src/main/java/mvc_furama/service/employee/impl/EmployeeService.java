package mvc_furama.service.employee.impl;

import mvc_furama.model.employee.Employee;
import mvc_furama.repository.employee.IEmployeeRepository;
import mvc_furama.repository.employee.impl.EmployeeRepository;
import mvc_furama.service.employee.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private final IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> selectAll() {
        return this.employeeRepository.selectAll();
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
