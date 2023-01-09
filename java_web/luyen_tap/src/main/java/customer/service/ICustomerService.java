package customer.service;

import customer.model.Customer;
import customer.repository.impl.CustomerRepository;

import java.util.List;

public interface ICustomerService {
    List<Customer> selectAll();
    Customer selectById(int id);
    boolean insertCustomer(Customer customer);
    boolean deleteCustomer(int id);
    boolean updateCustomer(int id, Customer customer);
    List<Customer> search(String name, String country);
}
