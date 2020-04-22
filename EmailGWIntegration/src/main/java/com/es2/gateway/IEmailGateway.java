package com.es2.gateway;

import com.es2.customer.Customer;

public interface IEmailGateway {
    void sendSpecialGreetings(Customer paramCustomer);

    void sendRegularGreetings(Customer paramCustomer);
}
