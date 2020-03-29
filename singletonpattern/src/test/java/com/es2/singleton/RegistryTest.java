package com.es2.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class RegistryTest {
    @AfterAll
    static void tearDown() {
        new End();
    }

    @Test
    void getInstance() {
    }

    @Test
    void setPath() {
        Registry.getInstance().setPath("testPath");
        Assertions.assertEquals("testPath", Registry.getInstance().getPath());
    }

    @Test
    void setNullPath() {
        Registry.getInstance().setPath(null);
        Assertions.assertNull(Registry.getInstance().getPath());
    }

    @Test
    void getConnectionString() {
    }

    @Test
    void setConnectionString() {
        Registry.getInstance().setConnectionString("testConnection");
        Assertions.assertEquals("testConnection", Registry.getInstance().getConnectionString());
    }

    @Test
    void setNullConnectionString() {
        Registry.getInstance().setConnectionString(null);
        Assertions.assertNull(Registry.getInstance().getConnectionString());
    }

    @Test
    void getPath() {
    }

    @Test
    void singletonConstructor() throws NoSuchMethodException {
        Constructor<Registry> registryConstructor = Registry.class.getDeclaredConstructor();
        Assertions.assertTrue(Modifier.isPrivate(registryConstructor.getModifiers()));
    }
}
