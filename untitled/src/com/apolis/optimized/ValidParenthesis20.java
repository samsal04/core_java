package com.apolis.optimized;

import java.util.Stack;

//Given a string containing just the characters '(' and ')',
//return the length of the longest valid (well-formed) parentheses substring.
//
//        Example 1:
//        Input: s = "(()"
//        Output: 2
//        Explanation: The longest valid parentheses substring is "()".
//
//        Example 2:
//        Input: s = ")()())"
//        Output: 4
//        Explanation: The longest valid parentheses substring is "()()".
//
//        Example 3:
//        Input: s = ""
//        Output: 0
public class ValidParenthesis20 {
    private static boolean validParenthesis(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if (c=='['){
                stack.push(']');
            }else if (c=='{'){
                stack.push('}');
            }else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s="(()";
        System.out.println(validParenthesis(s));
    }
}
