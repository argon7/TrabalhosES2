package com.es2.singleton;

public class Registry {
    private String path = null;
    private static volatile Registry instance = null;

    private Registry() {
    }

    public static Registry Registry(String path, String connectionString) {
        if (instance == null)
            synchronized (Registry.class) {
                if (instance == null)
                    instance = new Registry();
            }
        return instance;
    }


    public String getPath() {
        return this.path;
    }

}