package com.yashpd;
//https://leetcode.com/problems/spiral-matrix/ (Amazon)

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> result = spiralOrder(mat);
        System.out.println(result);
    }
    static List<Integer> spiralOrder(int[][] matrix){
        ArrayList<Integer> ans = new ArrayList<>(10);

        int direction = 0; // 0 = right, 1 = down, 2 = left, 3 = up

        int upper_border = 0;
        int lower_border = matrix.length-1;
        int left_border = 0;
        int right_border = matrix[0].length-1;

        int i=0;
        int j=0;

        while (upper_border<lower_border+1 && left_border<right_border+1){
            ans.add(matrix[i][j]);

            if (direction == 0) {
                if(j < right_border){
                    j++;
                } else {
                    upper_border++;
                    direction = 1;
                    i++;
                }
            } else if (direction == 1) {
                if (i < lower_border) {
                    i++;
                } else{
                    right_border--;
                    direction = 2;
                    j--;
                }
            } else if (direction == 2) {
                if (j > left_border) {
                    j--;
                } else{
                    lower_border--;
                    direction = 3;
                    i--;
                }
            } else {
                if (i > upper_border) {
                    i--;
                } else{
                    left_border++;
                    direction = 0;
                    j++;
                }
            }
        }


        return ans;
    }
}
