package com.saikat;

import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // pat1(n);
        // pat2(n);
        // pat3(n);
        // pat4(n);
        // pat5(n);
        //pat6(n);
        //pat7(n);
        //pat8(n);
        //pat9(n);
        //pat10(n);
        //pat11(n);
        //pat12(n);
        //pat13(n);
        //pat28(n);
        // pat14();
        // pat26(n);
        //pat21(n);
        pat22(n);
    }
    static void pat1(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat2(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat3(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = n-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat4(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pat5(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = n-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat6(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat7(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = n-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat8(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat9(int n)
    {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <j ; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2*(n-j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat10(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat11(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = n-i;j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat12(int n)
    {
        pat11(n);
        pat10(n);
    }
    static void pat13(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for(int j=1;j<n-1;j++)
        {
            for(int i=0;i<n-j-1;i++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int i=0;i<j;i++)
            {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i <2*n; i++) {
            System.out.print("*");
        }
    }
    static void pat14()
    {
        int n=5;
        for(int i=0;i<2*n-1;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for (int j=n-2;j>0;j--) {
            for (int i = 0; i < n - j-1; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 0; i < 2*j-1; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < n-1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
    static void pat28(int n)
    {
        for (int i = 0; i < 2*n; i++) {
            int c = i>n?2*n-i:i;
            for (int j = 0; j < n-c; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat26(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pat21(int n)
    {
        int ctr=1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(ctr+" ");
                ctr++;
            }
            System.out.println();
        }
    }
    static void pat22(int n)
    {

        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print((i+j+1)%2 + " ");
            }
            System.out.println();
        }
    }
}