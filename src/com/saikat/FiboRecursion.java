package com.saikat;
import java.util.ArrayList;
import java.util.Scanner;
public class FiboRecursion {
    static ArrayList<Object> Integer = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n)
    {
        if(n==0 || n==1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
// 1 1 2 3 5 8 13 21 34 55 89 144