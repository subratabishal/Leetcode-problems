package com.saikat;

public class InsertNum {
    public static void main(String[] args) {

    }
    int srchInsertPos(int[] arr, int target)
    {
        int n = arr.length;
        if(target>arr[n-1])
            return n;
        else if(target<arr[0])
            return 0;
        else
        {
            int l=0;
            int mid;
            while (l<=n)
            {
                mid=(l+n)/2;
                if(arr[mid]==target)
                    return mid;
                else if(l==n)
                {
                    if(arr[l]>target)
                        return l;
                    return l+1;
                }
                else if(arr[mid]>target)
                    n=mid-1;
                else l=l+1;
            }
        }
        return 0;
    }
}
