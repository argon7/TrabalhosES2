package com.es2.singleton;

public class Registry {
    private String path = null;
    private static volatile Registry instance = null;
    private String connectionString = null;

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

    public void setPath(String path) {
        this.path = path;
    }

    public static Registry getInstance() {
        return instance;
    }

    public static void setInstance(Registry instance) {
        Registry.instance = instance;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getPath() {
        return this.path;
    }

}