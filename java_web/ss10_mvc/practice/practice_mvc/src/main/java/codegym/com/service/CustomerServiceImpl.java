package codegym.com.service;

import codegym.com.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService{
    private  static Map<Integer,Customer> customers = new HashMap<>();
    static {
        customers.put(1, new Customer(1,"Trần Ngọc Vũ","vu@mail.com","Quảng Nam"));
        customers.put(2, new Customer(1,"Trần Ngọc Hải","hai@mail.com","Quảng Nam"));
        customers.put(3, new Customer(1,"Trần Ngọc Gia Bảo","bao@mail.com","Quảng Nam"));
    }
    @Override
    public List<Customer> getAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void saveCustomer(Customer customer) {
customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
customers.put(id,customer);
    }

    @Override
    public void removeCustomer(int id) {
customers.remove(id);
    }
}
