package com.saikat;

import java.util.Scanner;

public class Sqrt69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to find its square root");
        int n = in.nextInt();
        System.out.println(sqrt(n));

    }
    static int sqrt(int x)
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
