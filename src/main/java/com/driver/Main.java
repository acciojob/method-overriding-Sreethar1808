package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B. " + super.meth();
        }
    }

    public static void main(String[] args) {
        B b1 = new B();
        b1.meth();

        B b2 = new B();
        b2.meth();
    }
}
