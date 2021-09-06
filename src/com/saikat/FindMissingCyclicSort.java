package com.saikat;

import java.util.Arrays;
//https://leetcode.com/problems/missing-number/submissions/
public class FindMissingCyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,1,3,2,6,5,0};

        System.out.println(cycleSort(arr));
        //System.out.println("printed the number");
    }
    static int cycleSort(int[] arr)
    {
        //System.out.println("entered cycle sort function");
        int i=0;
        while(i<arr.length)
        {
            //System.out.println("Entered while loop");
            if(arr[i]==arr.length) {
                i++;
                continue;
            }
            if(arr[i]!=arr[arr[i]]) {
               // System.out.println("Entered if statement");
                swap(arr, i, arr[i]);
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(arr));
        return linearSearch(arr);

    }
    static int binSearch(int[] arr)
    {
        int start =0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==mid)
                start = mid+1;
            else if(arr[mid]==mid+1)
                end = mid-1;

        }
        return end;
    }
    static int linearSearch(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr[i])
                return i;
        }
        return arr.length;
    }
    static void swap(int[] arr, int a, int b)
    {
        //System.out.println("Entered swap function");
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
}
