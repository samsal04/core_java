package com.apolis.stringmanipulation;
//Given a string s, find the first non-repeating character in it and return its index.
//If it does not exist, return -1.
//
//        Example 1:
//        Input: s = "leetcode"
//        Output: 0
//
//        Example 2:
//        Input: s = "loveleetcode"
//        Output: 2
//
//        Example 3:
//        Input: s = "aabb"
//        Output: -1


import java.util.HashMap;

/** Logic
 *  1) Traverse through the string and create hashmap as per occurrences of character.
 *  2) Traverse through the string and check the occurrences of character.
 *  3) return the first character that has occurred just 1 time
 */
public class FirstNonRepeatingChar387 {
    private static int firstUniqeChar(String s) {
//        int index=0;
//        for(int i=0;i<s.length();i++){
//            for(int j=i+1;j<s.length();j++){
//
//                if(s.charAt(i)==s.charAt(j)){
//                    index=-1;
//                    continue;
//                }
//
//
//            }
//        }
//        return index;
        HashMap<Character,Integer> hashMap= new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){

            if(hashMap.containsKey(s.charAt(i))){

                count= hashMap.get(s.charAt(i));
                hashMap.put(s.charAt(i),count+1);
            }
            else {
                hashMap.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<s.length();i++){
            if(hashMap.get(s.charAt(i))==1){
                return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        String s= "loveleetcode";
        System.out.println(firstUniqeChar(s));
    }
}
