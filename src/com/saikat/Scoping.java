package com.saikat;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Saikat";
        {
            int c =30;
            b = 100;
            System.out.println(b);
            name = "Bittu";
        }
        System.out.println(b);
        System.out.println(name);
       // System.out.println(c);
       // - blocking the scope through curly braces
    }
}
