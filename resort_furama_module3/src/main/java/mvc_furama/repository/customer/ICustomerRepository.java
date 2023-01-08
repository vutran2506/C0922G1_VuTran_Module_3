package mvc_furama.repository.customer;

import mvc_furama.model.customer.Customer;


import java.util.List;

public interface ICustomerRepository {
    List<Customer> selectAllCustomer();

    Customer selectCustomerById(int id);

    boolean insertCustomer(Customer customer);

    boolean deleteCustomer(int id);

    boolean updateCustomer(int id, Customer customer);

    List<Customer> selectCustomerByName(String name);
}
