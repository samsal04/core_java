package com.apolis.javapractice;
//Given two binary strings a and b, return their sum as a binary string.
//        Example 1:
//        Input: a = "11", b = "1"
//        Output: "100"
//
//        Example 2:
//        Input: a = "1010", b = "1011"
//        Output: "10101"


public class BinarySum {
    private static String string(String a,String b){
//        int min= 0;
//        char flag='0';// 1111  100 => 1011  reverse    111  001  => 1110
//
//        if (a.length()==0 ){
//                        return b;
//        }
//        if (b.length()==0 ){
//            return a;
//        }
//
//        if (a.length()>=b.length()){
//            min=b.length();
//        }else{
//            min=a.length();
//        }
//        StringBuilder stringBuilder=new StringBuilder("");
////        stringBuilder.append("90");
//        for(int i=min-1;i>=0;i--){
//
//            if (a.charAt(i)=='0' && b.charAt(i)=='0'){
//                if (flag=='1'){
//                    stringBuilder.append("1");
//                }
//                else {
//                    stringBuilder.append("0");
//                }
//            }
//             if ( (a.charAt(i)=='0' && b.charAt(i)=='1' )|| ( a.charAt(i)=='1' && b.charAt(i)=='0')){
//                if (flag=='0') {
//                    stringBuilder.append("1");
//                }if(flag=='1'){
//                    stringBuilder.append("0");
//                    flag=1;
//                 }
//            }
//             if(a.charAt(i)=='1' && b.charAt(i)=='1'){
//                 if (flag=='0') {
//                     flag = '1';
//                     stringBuilder.append("0");
//
//                 }
//                 if(flag=='1') {
//                     flag='1';
//                     stringBuilder.append("1");
//
//                 }
//            }
//
//        }
//        int count=0;
//        StringBuilder stringBuilder=new StringBuilder("");
//
//        while(count<=min-1){
//            if (a.charAt(count)=='0' && b.charAt(count)=='0'){
//                if (flag=='1'){
//                    stringBuilder.append("1");
//                }
//                else {
//                    stringBuilder.append("0");
//                }
//            }
//            if ( (a.charAt(count)=='0' && b.charAt(count)=='1' )|| ( a.charAt(count)=='1' && b.charAt(count)=='0')){
//                if (flag=='0') {
//                    stringBuilder.append("1");
//                }if(flag=='1'){
//                    stringBuilder.append("0");
//                    flag=1;
//                }
//            }
//            if(a.charAt(count)=='1' && b.charAt(count)=='1') {
//                if (flag == '0') {
//                    flag = '1';
//                    stringBuilder.append("0");
//
//                }
//                if (flag == '1') {
//                    flag = '1';
//                    stringBuilder.append("1");
//                }
//            }
//            count++;
//        }
//
//        if(a.length()>count) {
//            stringBuilder.append(a.substring(0, a.length() - 1 - count));
//        }else {
//            stringBuilder.append(b.substring(0, b.length() - 1 - count));
//        }
//
////        System.out.println(stringBuilder);
//
//        return String.valueOf(stringBuilder.reverse());
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0)
                carry += a.charAt(i--) - '0';
            if (j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();


    }

    public static void main(String[] args) {
        String a ="11";
        String b="1";

        System.out.println(string(a,b));
    }
}
