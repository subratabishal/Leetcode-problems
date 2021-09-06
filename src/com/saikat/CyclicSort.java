package com.saikat;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycleSort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]!=arr[arr[i]-1])
                swap(arr,i,arr[i]-1);
            else
                i++;
        }
    }
    static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
}
