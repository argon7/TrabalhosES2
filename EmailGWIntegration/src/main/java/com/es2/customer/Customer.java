package com.es2.customer;

public class Customer {
    private String email;

    private String name;

    private String city;

    public Customer(String name, String email, String city) {
        this.name = name;
        this.email = email;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String getEmail() {
        return this.email;
    }
}
