package com.apolis.repeated;

import java.util.HashMap;

//Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
//Letters are case sensitive, for example,"Aa" is not considered a palindrome here.
//
//        Example 1:
//        Input: s = "abccccdd"
//        Output: 7
//        Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
//
//        Example 2:
//        Input: s = "a"
//        Output: 1
//        Explanation: The longest palindrome that can be built is "a", whose length is 1.
public class LongestPalindrome {
    private static int palindrome(String s) {

//        String longest="";
//        for(int i=0;i<s.length();i++){
//
//            for (int j=i+1;j<s.length();j++){
//
//                String sub= s.substring(i,j);
//
//                if(isPalindrome(sub) && longest.length()<sub.length()){
//                    longest=sub;
//                }
//            }
//        }
//        System.out.println(longest);
//        return longest.length();
//    }
//
//    private static boolean isPalindrome(String sub) {
//        StringBuilder stringBuilder= new StringBuilder(sub);
//      String.valueOf(stringBuilder.reverse());
//        return sub.equals(String.valueOf(stringBuilder.reverse()));

        HashMap<Character,Integer> map= new HashMap<>();
        int length=0;

        for(int i=0;i<s.length();i++){
            map.compute(s.charAt(i),(key,value)->(value==null)?1:value+1);
        }
        boolean flag= false;
        for (char c:map.keySet()){
            if(flag== false && map.get(c)%2==1){
                length+= map.get(c);
                flag=true;
            }else if(flag==true && map.get(c)%2==1 ) {
                length+= (map.get(c))-1;
            }else if(flag==true && map.get(c)%2==0 ) {
                length+= (map.get(c));
            }
        }
        System.out.println(map);
        return length;
    }

    public static void main(String[] args) {
        String s= "abccccdd";
        System.out.println(palindrome(s));
    }
}
