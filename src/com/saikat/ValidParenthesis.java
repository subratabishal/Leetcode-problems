package com.saikat;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brackets = sc.next();
        System.out.println(isValid(brackets));

    }
    static boolean isValid(String s)
    {
        Stack<Character> opening = new Stack<>();
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('){
                opening.push(')');
            }
            else if(s.charAt(i)=='['){
                opening.push(']');
            }
            else if(s.charAt(i) == '{')
            {
                opening.push('}');
            }
            else
            {
                if(opening.empty() || opening.pop() != s.charAt(i))
                    return false;
            }
        }
        if(opening.empty())
            return true;
        else
            return false;
    }
}
