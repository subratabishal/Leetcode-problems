package com.saikat;

public class Overloading {
    public static void main(String[] args) {
        fun(37);
        fun("Saikat");
    }
    static void fun(String name)
    {
        System.out.println(name);
    }
    static void fun(int n)
    {
        n--;
        System.out.println(n*2);
    }
}
