package com.driver;
public class Main {
    public static class A {
        public static String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A{
        public static String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        B b1 = new B();
        b1.meth();


        B b2 = new B();

        b2.meth();

//        B b2 = new B();
//        String str2 = b2.meth();
//        System.out.println(str2);
    }
}
