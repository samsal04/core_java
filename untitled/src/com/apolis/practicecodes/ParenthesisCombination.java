package com.apolis.practicecodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//        Example 1:
//        Input: n = 3
//        Output: ["((()))","(()())","(())()","()(())","()()()"]
//        Example 2:
//        Input: n = 1
//        Output: ["()"]
//        Constraints:
//        1 <= n <= 8
public class ParenthesisCombination {

    public static void main(String[] args) {

        Integer n=3;

        System.out.println(combinations(n));

    }

    private static List<String> combinations(Integer n) {



       if (n==0){
           return Arrays.asList(" ");
       }

       if(n==1){
           return Arrays.asList("()");
       }

       else {
           String[] leftSide=new String[n];
           String[] rightSide=new String[n];

          for(int i=0;i<n;i++){



          }


       }

        return null;
    }
}
