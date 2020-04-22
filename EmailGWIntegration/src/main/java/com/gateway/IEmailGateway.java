package com.gateway;

import com.customer.Customer;

public interface IEmailGateway {
    void sendSpecialGreetings(Customer paramCustomer);

    void sendRegularGreetings(Customer paramCustomer);
}
