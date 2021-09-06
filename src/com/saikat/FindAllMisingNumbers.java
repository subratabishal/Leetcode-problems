package com.saikat;
/*
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMisingNumbers {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,1};
        System.out.println(findDissapearedNumbers(arr));
    }
    static List<Integer> findDissapearedNumbers(int[] nums)
    {
        List<Integer> l= new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]>nums.length)
            {
                i++;
                continue;
            }
            if(nums[i]!=i+1)
            {
                swap(i,nums[i-1],nums);
            }
            else i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(j!=nums[j])
                l.add(j);
        }
        return l;
    }
    static void swap(int a, int b, int[] nums)
    {
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b] = temp;
    }
}
