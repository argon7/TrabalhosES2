package com.es2.repository;
import com.es2.customer.Customer;

public interface ICustomerRepository {
    Customer getCustomerByEmail(String paramString);

    void save(Customer paramCustomer);
}
