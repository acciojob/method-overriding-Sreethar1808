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

    public void main(String[] args) {
        B b1 = new B();
        String str = b1.meth();
        System.out.println(str);

        B b2 = new B();

        System.out.println(b2.meth());

//        B b2 = new B();
//        String str2 = b2.meth();
//        System.out.println(str2);
    }
}
