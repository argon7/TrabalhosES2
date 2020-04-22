package com.es2.controllers;

import com.es2.customer.Customer;
import com.es2.gateway.IEmailGateway;
import com.es2.http.HttpResponseMessage;
import com.es2.repository.ICustomerRepository;

public class CustomerController {
    private ICustomerRepository repository;

    private IEmailGateway emailGateway;

    public CustomerController(ICustomerRepository repository, IEmailGateway emailGateway) {
        this.repository = repository;
        this.emailGateway = emailGateway;
    }

    public HttpResponseMessage createCustomer(String name, String email, String city) {
        Customer existingCustomer = this.repository.getCustomerByEmail(email);
        if (existingCustomer != null)
            return new HttpResponseMessage(301, "Customer with such email address already exists");
        Customer customer = new Customer(name, email, city);
        this.repository.save(customer);
        if (city.equals("Odense")) {
            this.emailGateway.sendSpecialGreetings(customer);
        } else {
            this.emailGateway.sendRegularGreetings(customer);
        }
        return new HttpResponseMessage(200, "OK");
    }
}
