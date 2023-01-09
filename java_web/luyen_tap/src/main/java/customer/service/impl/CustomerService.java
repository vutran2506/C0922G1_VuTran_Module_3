package customer.service.impl;

import customer.model.Customer;
import customer.repository.ICustomerRepository;
import customer.repository.impl.CustomerRepository;
import customer.service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private  final ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> selectAll() {
        return this.customerRepository.selectAll();
    }

    @Override
    public Customer selectById(int id) {
        return this.customerRepository.selectById(id);
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
    public List<Customer> search(String name, String country) {
        return this.customerRepository.search(name,country);
    }
}
