package com.es2.singleton;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SingletonTest {
    @Test
    public void whenEmptyString_thenAccept() {
        Singleton palindromeTester = new Singleton();
        assertTrue(palindromeTester.isPalindrome(""));
    }
}
