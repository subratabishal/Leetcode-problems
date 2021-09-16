package com.saikat;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers\n");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(SumNum(num1-1, num2+1));
    }
    static int SumNum(int a, int b)
    {
        return a+b;
    }
}
