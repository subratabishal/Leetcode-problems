package com.saikat;

public class Shadowing {
    static int x =10;//this gets shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x);
        x =18; // this shadows the global variable
        System.out.println(x);
        fun();
    }
    static void fun()
    {
        System.out.println("x="+x);
    }
}
