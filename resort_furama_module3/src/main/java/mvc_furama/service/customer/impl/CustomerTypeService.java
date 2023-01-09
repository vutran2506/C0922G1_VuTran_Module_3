package mvc_furama.service.customer.impl;

import mvc_furama.model.customer.CustomerType;
import mvc_furama.repository.customer.ICustomerTypeRepository;
import mvc_furama.repository.customer.impl.CustomerTypeRepository;
import mvc_furama.service.customer.ICustomerTypeService;

import java.util.List;

public class CustomerTypeService implements ICustomerTypeService {
    private final ICustomerTypeRepository customerTypeRepository= new CustomerTypeRepository();
    @Override
    public List<CustomerType> findAll() {
        return this.customerTypeRepository.findAll();
    }
}
