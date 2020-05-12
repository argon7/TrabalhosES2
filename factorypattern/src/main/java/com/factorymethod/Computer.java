package com.factorymethod;

/**
 * The type Computer.
 */
public class Computer implements Product {

    private String brand = null;

    /**
     * Instantiates a new Computer.
     */
    protected Computer() {
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
