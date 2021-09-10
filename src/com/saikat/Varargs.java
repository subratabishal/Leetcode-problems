package com.saikat;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
    fun("Saikat",1,2,3,4);
    }
    static void  fun(String s, int ...v)
    {
        System.out.println(Arrays.toString(v));
        System.out.println(s);
    }
    static void MultipleArgs(int a, String b, char ...c)
    {
        
    }
}
