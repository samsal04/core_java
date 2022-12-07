package com.apolis.practicecodes;
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//       An input string is valid if:
//       Open brackets must be closed by the same type of brackets.
//       Open brackets must be closed in the correct order.
//       Every close bracket has a corresponding open bracket of the same type.
//       Example 1:
//       Input: s = "()"
//       Output: true
//
//        Example 2:
//        Input: s = "()[]{}"
//        Output: true
//
//        Example 3:
//        Input: s = "(]"
//        Output: false


import java.util.Stack;

public class ValidParentheses {
    private static boolean isValid(String s) {

        Stack<Character> stack1= new Stack<>();

        for(int i=0;i<s.length();i++){

            if (s.charAt(i)=='(' ||s.charAt(i)== '['||s.charAt(i)=='{'){
                stack1.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')' && !stack1.isEmpty() && stack1.peek() == '(') {
                stack1.pop();
            } else if (s.charAt(i) == '}' && !stack1.isEmpty() && stack1.peek() == '{') {
                stack1.pop();
            } else if (s.charAt(i) == ']' && !stack1.isEmpty() && stack1.peek() == '[') {
                stack1.pop();
            }
            else {
                return false;
            }
        }



        return stack1.isEmpty();
    }

    public static void main(String[] args) {

        String s= "(])";

        System.out.println(isValid(s));
    }


}
