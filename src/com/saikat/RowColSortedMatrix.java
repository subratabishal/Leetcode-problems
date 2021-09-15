package com.saikat;
import java.util.Arrays;
import java.util.Scanner;

public class RowColSortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,35,39,55}};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(Arrays.toString(searchTarget(mat, target)));
    }
    static int[] searchTarget(int[][] mat,int target)
    {
        int start = 0, end = mat[0].length-1;
        if(target<mat[0][0] || target > mat[mat.length-1][end])
        {
            return new int[]{-1,-1};
        }
        while (start<=end)
        {
            if(mat[start][end]>target)
            {
                end--;
            }
            if(mat[start][end]< target)
            {
                start++;
            }
            if(mat[start][end] == target)
            {
                return new int[]{start,end};
            }
        }
        return new int[]{-1,-1};
    }
}
/*
10 20 30 40
15 25 35 45
28 29 37 49
33 35 39 55



*/