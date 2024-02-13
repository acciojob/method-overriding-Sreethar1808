package com.driver;

import com.driver.A;
import com.driver.B;
public class Main {
    public static void main(String[] args) {
        B b = new B();
        String str = b.meth();
        System.out.println(str);

        String strA = b.meth();
        System.out.println(strA);
    }
}