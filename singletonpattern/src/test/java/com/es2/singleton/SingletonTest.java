package com.es2.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    public void whenEmptyString_thenAccept() {
        Singleton palindromeTester = new Singleton();
        assertTrue(palindromeTester.isPalindrome(""));
    }

    @Test
    void isPalindrome() {
    }

    @Test
    void printPath() {
    }

    @Test
    void main() {
    }
}