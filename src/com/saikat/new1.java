package com.saikat;

public class new1 {
    public static void main(String[] args) {
        int count = 0;
        int a =3;
        while(count++<3)
        {
            int b = (1+2*count)%3;
            switch (b) {
                case 0 -> a = -1;
                case 1 -> a += 5;
            }
        }
        System.out.println(a);
    }
}
