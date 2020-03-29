package com.es2.singleton;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegistryTest {
    @AfterAll
    static void tearDown() {
        new End();
    }

    @DisplayName("Crie um teste para verificar se o msetPath() regista o caminho do ficheiro corretamente.")
    @Test
    void setPath() {
        Registry.getInstance().setPath("testPath");
        Assertions.assertEquals("testPath", Registry.getInstance().getPath());
    }

    @DisplayName("Crie um teste para verificar se o msetPath() tem o comportamento expectquanto recebe um valor null.")
    @Test
    void testSetNullPath() {
        Registry.getInstance().setPath(null);
        Assertions.assertNull(Registry.getInstance().getPath());
    }

    @DisplayName("Crie um teste para verificar se o msetConnectionString() regista a string de conexcorretamente")
    @Test
    void testSetConnectionString() {
        Registry.getInstance().setConnectionString("testConnection");
        Assertions.assertEquals("testConnection", Registry.getInstance().getConnectionString());
    }

    @DisplayName("Crie um teste para verificar se o msetConnectionString() tem o comportamento expectquanto recebe um valor null.")
    @Test
    void testSetNullConnectionString() {
        Registry.getInstance().setConnectionString(null);
        Assertions.assertNull(Registry.getInstance().getConnectionString());
    }

    @DisplayName("Crie um teste para verificar se o construtor da classe Singleton() privado. Pode utilizar a expressfail(...) para fazer o teste falhar, caso o construtor seja p")
            @Test
            void testSingletonConstructor() throws NoSuchMethodException {
            Constructor<Registry> registryConstructor = Registry.class.getDeclaredConstructor();
            Assertions.assertTrue(Modifier.isPrivate(registryConstructor.getModifiers()));
            }
}
