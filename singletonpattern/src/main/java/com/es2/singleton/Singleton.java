package com.es2.singleton;

public class Singleton {

    // this method is just for testing JaCoCo and Junit
    public boolean isPalindrome(String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String mid = inputString.substring(1, inputString.length() - 1);
            return (firstChar == lastChar) && isPalindrome(mid);
        }
    }


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
