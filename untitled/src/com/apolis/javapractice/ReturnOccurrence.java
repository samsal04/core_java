package com.apolis.javapractice;
//Write a function that takes a string and returns the number of times a given letter appears in the string.
//Write a function that takes a list of strings and returns the number of strings that have a length greater than 5.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnOccurrence {
    private static int occurrence(String str,char char1) {

        int n=0;
        HashMap<Character,Integer> map= new HashMap<>();

        for (int i=0;i<str.length();i++){

            map.compute(str.charAt(i),(key,value)->(value==null)?1:value+1);

        }
        if(map.containsKey(char1)){
            return map.get(char1);
        }
        return 0;
    }

    private static List<String> check(List<String> list, int n) {

       return list.stream().filter(s->s.length()>=5).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        String str="number of occurrences";
        List<String> list = Arrays.asList("something","i","dont","care");
        int n=5;
        char char1='c';
        System.out.println(occurrence(str,char1));
        System.out.println(check(list,n));
    }
}
