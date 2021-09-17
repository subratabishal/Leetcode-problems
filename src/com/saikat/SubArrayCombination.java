package com.saikat;
import java.util.Arrays;
import java.util.Scanner;

public class SubArrayCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

    }
    static void combinationUtility(int[] arr, int[] data,
                                   int start, int end,
                                   int index, int r)
    {
        if(index == r) {
            System.out.println(Arrays.toString(data));
            return;
        }
        for (int i=start; i<=end && end-i+1 >= r-index;i++)
        {
            data[index] = arr[i];
            combinationUtility(arr, data,i+1,end,index+1,r);
        }
    }
    static void printCombination(int[] arr, int n, int r)
    {
        int[] data = new int [r];
    }
    }
