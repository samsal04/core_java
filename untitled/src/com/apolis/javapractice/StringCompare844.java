package com.apolis.javapractice;
//Given two strings s and t, return true if they are equal when both are typed into empty text editors.
//'#' means a backspace character.
//Note that after backspacing an empty text, the text will continue empty.
//
//        Example 1:
//        Input: s = "ab#c", t = "ad#c"
//        Output: true
//        Explanation: Both s and t become "ac".
//
//        Example 2:
//        Input: s = "ab##", t = "c#d#"
//        Output: true
//        Explanation: Both s and t become "".
//
//        Example 3:
//        Input: s = "a#c", t = "b"
//        Output: false
//        Explanation: s becomes "c" while t becomes "b".

/*  Logic:
    1) Create 2 stacks for each (strings) provided and use a method to populate the stacks.
    2) Inside the method:
            i) if the charAt(i) is '#' and stack is not empty then pop, if empty then continue
            ii) if the chatAt(i) is not '#' then push the char in stack.
    3) Compare the two arrays and send true if they are equal and false if they are not.

 */

import java.util.Stack;

public class StringCompare844 {
    private static boolean backspaceCompare(String s, String t) {

        Stack<Character> stack1= new Stack<>();
        Stack<Character> stack2=new Stack<>();

        stack1=stackPopulate(s);
        stack2=stackPopulate(t);

      return stack1.equals(stack2);

    }

    private static Stack<Character> stackPopulate(String s) {
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){

            if (s.charAt(i)=='#'){
                if(stack.isEmpty()){
                    continue;
                }else {
                    stack.pop();
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack;
    }

    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s,t));
    }
}
