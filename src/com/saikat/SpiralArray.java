package com.saikat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralArray {
    public static void main(String[] args) {
        int[][] mat ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] mat2={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> ans=spiralOrder(mat);
        for (int item:ans) {
            System.out.print(item+" ");
        }
    }
    static List<Integer> spiralOrder(int[][] mat)
    {
        int d=0;
        int start_r =0,end_r=mat.length;
        int start_c=0,end_c=mat[0].length;
        List<Integer> list = new ArrayList<>();
        while(start_r<end_r && start_c<end_c)
        {
            if (d==0)
            {
                for (int i = start_c; i < end_c; i++) {
                    list.add(mat[start_r][i]);
                }
                start_r++;
            }
            if (d==1)
            {
                for (int i = start_r;i<end_r;i++)
                {
                    list.add(mat[i][end_c-1]);
                }
                end_c--;
            }
            if(d==2)
            {
                for (int i = end_c-1; i>=start_c ; i--) {
                    list.add(mat[end_r-1][i]);
                }
                end_r--;
            }
            if(d==3)
            {
                for (int i = end_r-1; i >=start_r; i--) {
                    list.add(mat[i][start_c]);
                }
                start_c++;
            }
            d+=1;
            d%=4;
        }
        return list;
    }
}
