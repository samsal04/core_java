package com.apolis.optimized;
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//
//        Example 1:
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//
//        Example 2:
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.
public class LongestCommonPrefix {
    private static String prefix(String[] strings) {
        if(strings==null || strings.length==0) return "";

        String prefix= strings[0];
        for (int i=0;i<strings.length;i++){

            while (strings[i].indexOf(prefix) !=0){

                prefix= prefix.substring(0, prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;
    }
    public static void main(String[] args) {
        String[] strings={"flower","flow","flight"};
        System.out.println(prefix(strings));
    }

}
