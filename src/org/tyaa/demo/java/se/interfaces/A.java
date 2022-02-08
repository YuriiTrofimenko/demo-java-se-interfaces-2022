package org.tyaa.demo.java.se.interfaces;

public class A {
    private static String staticSecret = "Static Secret";
    private String secret = "Secret";
    public class B {
        public String getSecret() {
            return secret + " from B-class object!";
        }
    }
    public static class C {
        public static String getStaticSecret() {
            return staticSecret + " from the C-class!";
        }
    }
}
