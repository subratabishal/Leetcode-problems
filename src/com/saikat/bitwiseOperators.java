package com.saikat;
import java.util.ArrayList;
import java.util.Scanner;
public class bitwiseOperators {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        conversionToOtherBases();

        }
        static void CommentOut(){
        int a = 12;
        int b =sc.nextInt();
        System.out.println(a^b);
        //returns 0 iff a and b are equal
        System.out.println(b^1);
        // complement of a is a^1(a xor 1)
        //a^0 = a
    }
        static void  conversionToOtherBases()
        {
            // 1. conversion from decimal to base b
                // Divide and append the remainder in each step in reverse order
            /* 2. conversion from base b to decimal*/
                // Multiply and add the power of the base with the digits.
            System.out.println("Enter number in decimal");
            int num = sc.nextInt();
            int num2 = num;
            int binI=0;
            int octI=0;
            ArrayList<Integer> arrBin= new ArrayList<>();
            ArrayList<Integer> arrOct = new ArrayList<>();
            while(num!=0||num2!=0)
            {
                int digBinary = num%2;
                arrBin.add(digBinary);
                binI++;
                num/=2;
                int digOctal = num2%8;
                arrOct.add(digOctal);
                octI++;
                num2/=8;
            }
            for (int j = binI-1; j >=0; j--) {
                System.out.print(arrBin.get(j));
            }
            System.out.print("\nOctal = ");
            for (int i = octI-1; i >= 0 ; i--) {
                int dig = arrOct.get(i);
                if(dig == 0)
                    continue;
                else
                    System.out.print(dig);
            }
        }
}
