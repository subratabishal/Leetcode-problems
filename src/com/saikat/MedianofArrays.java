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
