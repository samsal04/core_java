package com.apolis.codewars;
//Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
//
//        Notes:
//
//        Only lower case letters will be used (a-z). No punctuation or digits will be included.
//        Performance needs to be considered.
//
//        Examples
//
//        scramble('rkqodlw', 'world') ==> True
//        scramble('cedewaraaossoqqyt', 'codewars') ==> True
//        scramble('katas', 'steak') ==> False


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Scrambles {
    private static boolean scramble(String str1, String str2) {

//        char[] array= str1.toCharArray();

//        List<Character> list= str1.chars().mapToObj(c->(char)c).collect(Collectors.toList());
//
//      for (int i=0;i<str2.length();i++){
//          if(list.contains(str2.charAt(i))){
//              list.remove(list.indexOf(str2.charAt(i)));
//              continue;
//          }else {
//              return false;
//          }
//      }

//        return str1.matches(str2);

        Map<Character,Integer> map=  new HashMap<>();

        for (int i=0;i<str1.length();i++){

            map.compute(str1.charAt(i),(k,v)->(v==null)?1:v+1);

        }
        int count=0;
        for (int i=0;i<str2.length();i++){
            if(map.containsKey(str2.charAt(i)) && map.get(str2.charAt(i))!=0){
                count=map.get(str2.charAt(i));
                map.put(str2.charAt(i),count-1);
                continue;
            }
            return false;
        }
        System.out.println(map);

        return true;
//        Map<Integer, Integer> cnt = new HashMap<>();
//        str2.chars().forEach(i -> cnt.put(i, cnt.getOrDefault(i, 0) + 1));
//        str1.chars().filter(i -> cnt.containsKey(i)).forEach(i -> cnt.put(i, cnt.get(i) - 1));
//        return cnt.values().stream().filter(i -> i>0).count() == 0;
    }
    public static void main(String[] args) {
        String str1="rkqodlw";
        String str2="world";
        System.out.println(scramble(str1,str2));
    }
}
