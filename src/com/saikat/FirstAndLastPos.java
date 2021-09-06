package com.saikat;
import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 7, 7, 8, 8, 10, 12, 15};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] ans = findFirstandLast(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findFirstandLast(int[] arr, int target) {
        int[] nums = {-1, -1};
        if (arr.length == 0)
            return nums;
        if (endPos(arr, target) == -1)
            return nums;
        else {
            int f = startPos(arr, target);
            int l = endPos(arr, target);
            nums[0]=f;
            nums[1]=l;
        }
        return nums;
    }
    static int endPos(int[] arr, int target)
    {
        int start =0;int end = arr.length;
        int pos = -1;
        while (start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                pos = mid;
                start =mid+1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else end = mid-1;
        }
        return pos;
    }
    static int startPos(int[] arr, int target)
    {
        int start =0;
        int end = arr.length;
        int pos = -1;
        while (start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                pos = mid;
                end =mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else end = mid-1;
        }
        return pos;
    }
}
