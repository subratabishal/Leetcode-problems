package com.saikat;

public class MedianofArrays {
    public static void main(String[] args) {
        int[] nums1={1,3,5,7,9,34};
        int[] nums2 = {22,34,46,58,99};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        double mean = 0;
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0, k = 0;
        // calculating the mean size of both the arrays and using it to make a new array of size t + 1.
        // if mean size is 5 suppose, then the indices of new array will be 0 1 2 3 4 5;
        // I can just return the last index if (m+n) is odd and if even I can return (ans[4] + ans[5])/2;
        int t = (m + n)/2;
        int[] ans = new int[t + 1];

        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                ans[k] = nums1[i];

                // checking if the value of k in the new array is equal to the target.
                if(k == t){
                    return mean = ((m+n) % 2 != 0) ? ans[k] : (ans[k-1] + ans[k])/2.0;
                }
                k++; i++;
            }else{
                ans[k] = nums2[j];
                if(k == t){
                    return mean = ((m+n) % 2 != 0) ? ans[k] : (ans[k-1] + ans[k])/2.0;
                }
                k++; j++;
            }
        }
        // checking for remaining values if the return call in the above loop is not executed;
        while(j < n){
            ans[k] = nums2[j];
            if(k == t){
                return mean = ((m+n) % 2 != 0) ? ans[k] : (ans[k-1] + ans[k])/2.0;
            }
            j++; k++;
        }

        while(i < m){
            ans[k] = nums1[i];
            if(k == t){
                return mean = ((m+n) % 2 != 0) ? ans[k] : (ans[k-1] + ans[k])/2.0;
            }
            i++; k++;
        }
        return mean;
    }
    }
