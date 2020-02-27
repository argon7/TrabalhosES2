package com.es2.singleton;

public class Registry {
    private String path = null;
    private String connectionString = null;
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


    public static Registry getInstance() {
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

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public static void setInstance(Registry instance) {
        Registry.instance = instance;
    }

    public String getPath() {
        return this.path;
    }

    public String getConnectionString() {
        return this.connectionString;
    }
}