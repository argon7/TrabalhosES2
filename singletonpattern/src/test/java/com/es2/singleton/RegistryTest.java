package com.es2.singleton;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class RegistryTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Registry.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void registry() {
    }

    @Test
    public void getInstance() {
    }

    @Test
    public void setPath() {
    }

    @Test
    public void setConnectionString() {
    }

    @Test
    public void setInstance() {
    }

    @Test
    public void getPath() {
    }

    @Test
    public void getConnectionString() {
    }
}
