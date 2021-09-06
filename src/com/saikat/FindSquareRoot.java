package com.saikat;

import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findSqRoot(num));
    }
    static int findSqRoot(int x)
    {
        long low =0L;
        long high = x/2+1L;
        while(low<high)
        {
            long mid = low+(high-low+1)/2L;
            if(mid*mid <= x)
                low = mid;
            else high = mid-1;
        }
        return (int)low;
    }
}
/*
long low =0L;
        long high = x/2+1L;
        while(low<high)
        {
            long mid = low+(high-low+1)/2L;
            if(mid*mid <= x)
                low = mid;
            else high = mid-1;
        }
        return (int)low;
 */