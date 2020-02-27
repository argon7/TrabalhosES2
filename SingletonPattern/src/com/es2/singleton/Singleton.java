package com.es2.singleton;

public class Singleton {
    public static void main(String[] args) {
        Registry registry = Registry.Registry("1", "1");
        Registry registry2 = Registry.Registry("2", "2");
        System.out.println(registry.getPath());
        System.out.println(registry2.getPath());
        if (registry2.getPath().equals(registry.getPath()))
            System.out.println("OK");
        else
            System.out.println("Error: Registry was overwritten");
    }
}
