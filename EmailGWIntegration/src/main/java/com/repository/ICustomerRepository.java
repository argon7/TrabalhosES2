package com.repository;
import com.customer.Customer;

public interface ICustomerRepository {
    Customer getCustomerByEmail(String paramString);
    void save(Customer paramCustomer);
}
