package com.yashpd;

// https://leetcode.com/problems/set-matrix-zeroes/ (Microsoft)

import java.util.Arrays;

public class SetZeroes {
    public static void main(String[] args) {
        //not needed
    }

    static void setZeroes(int[][] matrix) {
        boolean firstrow = false;

        //checking for zero element and storing info in the matrix itself (in the first row and column).
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        firstrow = true;
                    }
                    else {
                        matrix[i][0] = 0;
                    }
                    matrix[0][j] = 0;
                }
            }
        }

        // iterating from bottom right to top left and converting to zero.
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (i == 0 && firstrow) {
                    matrix[i][j] = 0;
                }
                else if (i!=0 && (matrix[i][0]==0 || matrix[0][j]==0)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
