package com.es2.singleton;

public class Singleton {
    static void printPath(Registry _registry, Registry _registry2) {
        System.out.println(_registry.getPath());
        System.out.println(_registry2.getPath());
    }

    public static void main(String[] args) {
        Registry registry = Registry.Registry("1", "1");
        Registry registry2 = Registry.Registry("2", "2");
        printPath(registry, registry2);
    }
}
