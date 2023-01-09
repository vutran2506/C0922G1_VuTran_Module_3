package mvc_furama.service.customer.impl;

import mvc_furama.model.customer.Customer;
import mvc_furama.repository.customer.ICustomerRepository;
import mvc_furama.repository.customer.impl.CustomerRepository;
import mvc_furama.service.customer.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private  final ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> selectAllCustomer() {
        return this.customerRepository.selectAllCustomer();
    }

    @Override
    public Customer selectCustomerById(int id) {
        return this.customerRepository.selectCustomerById(id);
    }

    @Override
    public boolean insertCustomer(Customer customer) {
        return this.customerRepository.insertCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return this.customerRepository.deleteCustomer(id);
    }

    @Override
    public boolean updateCustomer(int id, Customer customer) {
        return this.customerRepository.updateCustomer(id,customer);
    }

    @Override
    public List<Customer> selectCustomerByName(String name) {
        return null;
    }
}
