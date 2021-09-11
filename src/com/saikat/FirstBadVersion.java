package com.saikat;

public class FirstBadVersion {
    static boolean[] arr = {false, false, false, false,false,true, true};
    public static void main(String[] args) {
        int n = arr.length;
        System.out.println(firstBadVersion(n));
    }
    static boolean isBadVersion(int n)
    {
        return arr[n - 1];
    }
    static int firstBadVersion(int n)
    {
        int start = 1;
        int end = n;
        int mid = start+(end-start)/2;
        while(start<=end)
        {
            mid = start+(end-start)/2;
            if(!isBadVersion(mid))
            {
                start=mid+1;
            }
            else
                end = mid-1;
        }
        return end;
    }
}
