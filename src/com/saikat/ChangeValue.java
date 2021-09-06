package com.saikat;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,3,2,45,6};
        change(arr);
        //System.out.println(arr);
        //the reference of the array is passed by value
        //hence the original array can be changed
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums)
    {
        nums[0]=99;
    }
}
