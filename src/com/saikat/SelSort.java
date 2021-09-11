package com.saikat;

import java.util.Arrays;

public class SelSort
{
    public static void main(String[] args) {
        int[] arr = {6,2,9,1,0,3,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr)
    {
        int l = arr.length;
        int maxpos=0;
        for(int j=0;j<l-1;j++) {
            for (int i = 0; i < l - j; i++) {
                if (arr[maxpos] < arr[i])
                    maxpos = i;
            }
            swap(arr, maxpos, l-1-j);
        }
    }
    static  void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
