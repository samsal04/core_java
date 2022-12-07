package com.apolis.stringmanipulation;
//Given an encoded string, return its decoded string.
//The encoding rule is: k[encoded_string], where the encoded_string inside
//the square brackets is being repeated exactly k times.
//Note that k is guaranteed to be a positive integer.
//You may assume that the input string is always valid; there are no extra white spaces,
//square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits
//and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
//The test cases are generated so that the length of the output will never exceed 105.
//
//        Example 1:
//        Input: s = "3[a]2[bc]"
//        Output: "aaabcbc"
//
//        Example 2:
//        Input: s = "3[a2[c]]"
//        Output: "accaccacc"
//
//        Example 3:
//        Input: s = "2[abc]3[cd]ef"
//        Output: "abcabccdcdcdef"


import java.util.Stack;

public class StringDecode394 {
    private static String decodeString(String s) {

//        if (s.length() == 0 || s == null) {
//            return s;
//        }
//
//
//        StringBuilder stringBuilder= new StringBuilder();
//        Stack<Character> stack= new Stack<>();
//        char[] chars=s.toCharArray();
//        int n=0;
//        for(int i=0;i<chars.length;i++){
//
//            if(chars[i]>='0' && chars[i]<='9'){
//               n= chars[i]-'0';
////               System.out.println("At "+ i+" value of n: "+n);
//               continue;
//            }else if (chars[i]=='[' || chars[i]==']'){
//                continue;
//            }else if(chars[i]>='a' && chars[i]<='z'){
//                int count=0;
//                while (count<n){
//                    stack.push(chars[i]);
//                    count++;
//                }
//                n=0;
//            }
//
//        }
//
//        System.out.println(stack.toString());
//
//        return "a";

        if (s.length() == 0 || s == null) {
            return s;
        }
        Stack<String> stringStack = new Stack<String>();
        Stack<Integer> numberStack = new Stack<Integer>();
        StringBuilder result = new StringBuilder();
        int index = 0;

        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int num = 0;
                while (Character.isDigit(s.charAt(index))) {

                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }
                numberStack.push(num);
            }
            else if (s.charAt(index) == '[') {

                stringStack.push(result.toString());
                result = new StringBuilder("");
                index++;
            }
            else if (s.charAt(index) == ']') {
                StringBuilder temp = new
                        StringBuilder(stringStack.pop());
                int repeatTimes = numberStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(result);
                }
                result = temp;
                index++;
            } else {
                result.append(s.charAt(index++));
            }
        }
        return result.toString();


    }
    public static void main(String[] args) {
        String s="3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}
