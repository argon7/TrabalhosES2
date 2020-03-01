package com.es.singleton;

public class Singleton {
    public static void main(String[] args) {
        Registry registry = Registry.Registry("1", "1");
        Registry registry2 = Registry.Registry("2", "2");
        System.out.println(registry.getPath());
        System.out.println(registry2.getPath());
    }
}
