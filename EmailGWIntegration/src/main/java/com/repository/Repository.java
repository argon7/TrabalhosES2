package com.repository;
import com.customer.Customer;
import java.util.HashMap;

public class Repository implements ICustomerRepository {
    public final HashMap<String, Customer> repository = new HashMap<>();

    public Customer getCustomerByEmail(String email) {
        if (this.repository.containsKey(email))
            return this.repository.get(email);
        return null;
    }

    public void save(Customer customer) {
        this.repository.put(customer.getEmail(), customer);
    }
}
