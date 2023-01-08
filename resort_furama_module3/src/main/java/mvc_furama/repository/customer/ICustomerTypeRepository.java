package mvc_furama.repository.customer;

import mvc_furama.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeRepository {
    List<CustomerType> findAll();
}
