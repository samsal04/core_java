package com.apolis.javapractice;

import java.util.HashSet;
import java.util.Set;

import static java.util.Objects.isNull;

public class PracticeStringConsistancy {
    public static void main(String[] args) {
        System.out.println(solution("World")); //1
        //System.out.println(solution("diddd")); //4
        //System.out.println(solution("cycle")); //2
//        System.out.println(solution("hhhh"));  //2
//        System.out.println(solution(null)); //2


    }
    public static int solution(String str){
        int counter=0;
        int remainingString=0;

        Set<Character> subString= new HashSet<>();

        if (isNull(str)){
            return 1;
        }

        while(remainingString<str.length()){

            if (subString.contains(str.charAt(remainingString))){
                counter++;
                subString.clear();
            }

            subString.add(str.charAt(remainingString));
            remainingString++;

        }


        return counter+1;

    }

}
