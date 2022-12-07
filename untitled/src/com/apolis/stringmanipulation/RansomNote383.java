package com.apolis.stringmanipulation;
//Given two strings ransomNote and magazine, return
//true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//Each letter in magazine can only be used once in ransomNote.
//
//        Example 1:
//        Input: ransomNote = "a", magazine = "b"
//        Output: false
//
//        Example 2:
//        Input: ransomNote = "aa", magazine = "ab"
//        Output: false
//
//        Example 3:
//        Input: ransomNote = "aa", magazine = "aab"
//        Output: true


/* Logic
   1) Convert the magazine into a hashmap with character as key and occurrence as value
   2) Traverse through the ransomNote array, check if the map contains the characters from
      ransomNote.
   3) If map contains the character then subtract the value by 1 and that it's not less than 0
   4) If less than 0 return false, if not then decrement the value and put back in map
   5) If the key doesn't exist in map then return false.
 */
import java.util.Arrays;
import java.util.HashMap;

public class RansomNote383 {
    private static boolean canConstruct(String ransomNote, String magazine) {

//       char[] ransomArray= ransomNote.toCharArray();
//       char[] magazineArray= magazine.toCharArray();
//
//       Arrays.sort(ransomArray);
//       Arrays.sort(magazineArray);
//
//        System.out.println( String.valueOf(ransomArray));
//        System.out.println(String.valueOf(magazineArray));
//        boolean flag=false;
//
//        for(int i=0;i<magazineArray.length && i<ransomArray.length;i++){
//
//            if(isPresent(ransomArray[i],magazineArray)){
//                flag=true;
//            }else{
//                flag=false;
//            }
//        }
//        return flag;
//    }
//
//    private static boolean isPresent(char c, char[] magazineArray) {
//
//       for(int i=0;i<magazineArray.length;i++){
//           if(magazineArray[i]==c){
//               return true;
//           }
//       }
//       return false;
//        char[] ransomArray= ransomNote.toCharArray();
//        char[] magazineArray= magazine.toCharArray();
//        boolean flag= false;
//        int count=0;
//        for(int i=0;i<ransomNote.length();i++){
//
//            for (int j=0;j<magazine.length();j++){
//                if (ransomArray[i]==magazineArray[j]){
//                    flag=true;
//                    count++;
//                }
//                else if(ransomArray[i]!=magazineArray[j]){
//                    flag=false;
//                }
//            }
//
//        }
//
//        if(count==ransomArray.length-1 && flag==true){
//            return true;
//        }
//
//        return false;

        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<magazine.length();i++) {

            map.compute(magazine.charAt(i),(key,value)-> (value==null)?1:value+1);

        }
        System.out.println(map);

        int count=0;
        for(int i=0;i<ransomNote.length();i++){
        if(map.containsKey(ransomNote.charAt(i))){
               count=map.get(ransomNote.charAt(i));
               count=count-1;
               if(count<0){
                   return false;
               }
               else{
                   map.put(ransomNote.charAt(i),count);
               }
        }
        else {
            return false;
        }
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote="a";
        String magazine="b";

        System.out.println(canConstruct(ransomNote,magazine));
    }
}
