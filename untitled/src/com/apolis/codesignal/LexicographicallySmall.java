package com.apolis.codesignal;
//Given two strings s and t, both consisting of lowercase English letters and digits,
//your task is to calculate how many ways exactly one digit could be removed from one of the strings so that
//s is lexicographically smaller than t after the removal.
//Note that we are removing only a single instance of a single digit,
//rather than all instances (eg: removing 1 from the string a11b1c could result in a1b1c or a11bc, but not abc).
//
//        Also note that digits are considered lexicographically smaller than letters.
//
//        Example
//
//        For s = "ab12c" and t = "1zz456", the output should be solution(s, t) = 1.
//
//        Here are all the possible removals:
//        We can remove the first digit from s, obtaining "ab2c". "ab2c" > "1zz456", so we don't count this removal
//        We can remove the second digit from s, obtaining "ab1c". "ab1c" > "1zz456", so we don't count this removal
//        We can remove the first digit from t, obtaining "zz456". "ab12c" < "zz456", so we count this removal
//        We can remove the second digit from t, obtaining "1zz56". "ab12c" > "1zz56", so we don't count this removal
//        We can remove the third digit from t, obtaining "1zz46". "ab12c" > "1zz46", so we don't count this removal
//        We can remove the fourth digit from t, obtaining "1zz45". "ab12c" > "1zz45", so we don't count this removal
//
//        The only valid case where s < t after removing a digit is "ab12c" < "zz456". Therefore, the answer is 1.
//
//        For s = "ab12c" and t = "ab24z", the output should be solution(s, t) = 3.
//
//        There are 4 possible ways of removing the digit:
//        "ab1c" < "ab24z"
//        "ab2c" > "ab24z"
//        "ab12c" < "ab4z"
//        "ab12c" < "ab2z"
//
//        Three of these cases match the requirement that s < t, so the answer is 3.

public class LexicographicallySmall {
    private static int check(String s, String t) {

//        int count=0;
//
//        for (int i=0;i<s.length();i++){
//
//            if(Character.isDigit(s.charAt(i))){
//                String newS=createNewString(i,s);
////                System.out.println(newS);
//                if(newS.compareTo(t)<0) count++;
//            }
//
//
//        }
//
//        for (int i=0;i<t.length();i++){
//            if(Character.isDigit(t.charAt(i))){
//                String newT=createNewString(i,t);
////                System.out.println(newT);
//                if(newT.compareTo(s)<0) count++;
//            }
//
//        }
//        return count;
//    }

//    private static boolean checkIfSamll(String newString,String secondString) {
//
//        for(int i=0;i<newString.length();i++){
//            if(newString.charAt(i)<secondString.charAt(i)){
//                continue;
//            }
//            else {
//                return false;
//            }
//        }
//        return true;
//    }

//    private static String createNewString(int n, String s) {
//        StringBuilder stringBuilder= new StringBuilder();
//        for (int i=0;i<s.length();i++){
//            if(i==n){
//                continue;
//            }else {
//                stringBuilder.append(s.charAt(i));
//            }
//        }
//        return String.valueOf(stringBuilder);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                String newStr = s.substring(0, i) + s.substring(i + 1);
                if (newStr.compareTo(t) < 0) {
                    count++;
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (Character.isDigit(t.charAt(i))) {
                String newStr = t.substring(0, i) + t.substring(i + 1);
                if (newStr.compareTo(s) > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "ab12c";
        String t = "1zz456";
        System.out.println(check(s,t));
    }
}
