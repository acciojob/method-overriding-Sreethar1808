package com.driver.test;


public class TestCases {
    class A {
        public String meth()
        {
            return "Invoking method from class A";
        }
    }
    class B extends A{
        public String meth()
        {
            return "Method is overridden in Extendend class B";
        }
    }
    public void main(String[] args) {

        B b = new B();
        String str = b.meth();
        System.out.println(str);


    }
    
}
