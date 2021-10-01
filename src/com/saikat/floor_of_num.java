package com.yashpd;

public class floor_of_num {
    public static void main(String[] args) {
        // floor of a number from an array (order-agnostic)
        int[] arr = {12, 34, 55, 67, 89};
        int target = 36;

        int[] arr2 = {99,87,78,69,57,34,12,3,1};
        int target2 = 85;

//        System.out.println(floorElement(arr, target));
        System.out.println(floorElement(arr2, target2));
    }

    static int floorElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]) {
            //ascending sorted
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return arr[mid];
                }
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            return arr[end];
        } else {
            // descending sorted
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return arr[mid];
                }
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            return arr[start];
        }
    }
}
