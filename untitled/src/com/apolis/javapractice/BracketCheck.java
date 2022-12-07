package com.apolis.javapractice;

import java.util.Stack;

/**Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 An input string is valid if:
 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Example 1:
 Input: s = "()"
 Output: true
 Example 2:
 Input: s = "()[]{}"
 Output: true
 Example 3:
 Input: s = "(]"
 Output: false
 Constraints:
 1 <= s.length <= 104
 s consists of parentheses only '()[]{}'.*/
public class BracketCheck {

    public static void main(String[] args) {
        String string= "([])";

        System.out.println(validString(string));
    }

    private static boolean validString(String string) {

        Stack<Character> stack= new Stack<>();

       for(int i=0;i<string.length();i++){
           char ch= string.charAt(i);

           if(ch== '('|| ch=='['||ch=='{'){
               stack.push(ch);
           }
           else if(ch== ')'|| ch==']'||ch=='}'){
               if(stack.empty()){
                   return  false;

               }
               char top=stack.pop();
               if(ch==')' && top!='('){
                   return  false;
               }
               if(ch=='[' && top!=']'){
                   return  false;
               }
               if(ch=='{' && top!='}'){
                   return  false;
               }
           }

       }

        return stack.isEmpty();
    }
}
