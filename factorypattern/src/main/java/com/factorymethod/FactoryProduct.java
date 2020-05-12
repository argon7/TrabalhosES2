package com.factorymethod;

/**
 * The type Factory product.
 */
public abstract class FactoryProduct {
    /**
     * Make product product.
     *
     * @param type the type
     * @return the product
     * @throws UndefinedProductException the undefined product exception
     */
    public static Product makeProduct(String type) throws UndefinedProductException {
        switch (type) {
            case "Computer":
                return new Computer();
            case "Software":
                return new Software();
            default:
                throw new UndefinedProductException();
        }
    }
}
