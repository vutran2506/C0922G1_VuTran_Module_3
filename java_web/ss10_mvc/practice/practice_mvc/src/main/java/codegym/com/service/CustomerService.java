package codegym.com.service;

import codegym.com.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    void saveCustomer(Customer customer);
    Customer findById(int id);
    void updateCustomer(int id,Customer customer);
    void removeCustomer(int id);
}
