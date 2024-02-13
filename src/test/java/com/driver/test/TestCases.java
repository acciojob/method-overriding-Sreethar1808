package com.driver.test;
class A {
    public static String meth()
    {
        return "Invoking method from class A";
    }
}
class B extends A{
    public static String meth()
    {
        return "Method is overridden in Extendend class B";
    }
}
public class TestCases {
    public static void main(String[] args) {

        B b = new B();
        String str = b.meth();
        System.out.println(str);


    }
    
}
