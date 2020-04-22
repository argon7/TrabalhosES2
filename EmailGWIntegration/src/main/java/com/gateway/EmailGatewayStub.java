package com.gateway;

import com.customer.Customer;
import java.util.ArrayList;

public class EmailGatewayStub implements IEmailGateway {
    static ArrayList<String> messagesSent = new ArrayList<>();

    public static int getSentEmails() {
        return messagesSent.size();
    }

    public static ArrayList<String> getMessagesSent() {
        return messagesSent;
    }

    public void sendSpecialGreetings(Customer customer) {
        messagesSent.add("Hello Dear Costumer" + customer.getName());
    }

    public void sendRegularGreetings(Customer customer) {
        messagesSent.add("Hello Dear Customer" + customer.getName());
    }
}
