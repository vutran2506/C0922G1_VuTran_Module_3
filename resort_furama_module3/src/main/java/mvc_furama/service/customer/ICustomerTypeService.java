package mvc_furama.service.customer;

import mvc_furama.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();

}
