package com.factorymethod;

/**
 * The type Software.
 */
public class Software implements Product {

    private String brand = null;

    /**
     * Instantiates a new Software.
     */
    protected Software() {
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
