package com.saikat;

import java.util.Scanner;

public class Sqrt69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to find its square root");
        int n = in.nextInt();
        //System.out.println(sqrt(n));
        System.out.println(preciseSqrt(n));

    }
    static double preciseSqrt(int n)
    {

        double x1 = sqrt(n);
        System.out.println(x1);
        while(x1*x1<n)
        {
            x1+=0.1;
        }
        return x1;
    }
    static double sqrt(int x)
    {
        long low=0L;
        long high = x/2+1L;
        while(low<high)
        {
            long mid = low+(high-low)/2L;
            if(mid*mid == x)
                return (int)mid;
            if(mid*mid< x)
                low =mid;
            else high = mid-1;
        }
        return (int)low;
    }
}
