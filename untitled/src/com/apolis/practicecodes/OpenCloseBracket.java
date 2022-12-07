package com.apolis.practicecodes;
//Given a string of brackets, the task is to find an index k which decides the number
//        of opening brackets is equal to the number of closing brackets.
//        The string must be consists of only opening and closing brackets i.e. ‘(‘ and ‘)’.
//
//        An equal point is an index such that the number of opening brackets before it is equal
//        to the number of closing brackets from and after.
//
//        Examples:
//
//        Input: str = “(())))(“
//        Output:   4
//        Explanation: After index 4, string splits into (()) and ))(.
//        The number of opening brackets in the first part is equal to
//        the number of closing brackets in the second part.

import java.util.Stack;

public class OpenCloseBracket {
    public static int bracket(String s){
        int count=0;
        Stack<Character> stack= new Stack<>();
//        boolean flag=false;

        for(int i=0;i<s.length();i++){

            if (s.charAt(i)=='('){

                stack.push(s.charAt(i));
//                flag=true;
            }
           else if(s.charAt(i)==')'){

               if(!stack.isEmpty()){
                   stack.pop();
                       count++;
                   }
            }
        }

        return count*2;
    }
    public static void main(String[] args) {
        String s="(((())))(";

        System.out.println(bracket(s));

    }
}
