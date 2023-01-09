package customer.repository;

import customer.model.Customer;

import java.util.List;

public interface ICustomerRepository {
List<Customer> selectAll();
Customer selectById(int id);
boolean insertCustomer( Customer customer);
boolean deleteCustomer(int id);
boolean updateCustomer(int id,Customer customer);
List<Customer> search(String name,String country);
}
