package com.apolis.practicecodes;
//Given a string, the task is to reverse the order of the words in the given string.
//
//        Input: s = “geeks quiz practice code”
//        Output: s = “code practice quiz geeks”
//
//        Input: s = “getting good at coding needs a lot of practice”
//        Output: s = “practice of lot a needs coding at good getting”


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseWordOrder {

    public static String reverse(String s){

       String[] s1= s.split(" ");
        StringBuilder stringBuilder= new StringBuilder();
       int count=0;
        for(int i=s1.length-1;i>=0 ;i--){

            stringBuilder.append(s1[i]+" ");
            count++;

        }

       return stringBuilder.toString();
//        return s2.toString();
    }
    public static void main(String[] args) {
        String s= "geeks quiz practice code";


//        Arrays.asList(s).stream().sorted().s;
//       System.out.println(Arrays.stream("geeks quiz practice code".split(" ")).sorted(Comparator.comparing(s1 -> )).collect(Collectors.toList()));

        String[] stringArray=s.split(" ");
        StringBuilder result= new StringBuilder();


                for (int i=stringArray.length-1;i>=0;i--){
//                    System.out.println(stringArray[i]);
                    result.append(stringArray[i]+" ");
                }

             System.out.println( result.toString());


                int[] array= {2,5,1,8,7};
                int sum= 9;
                int index=1;
                for(int i=0;i<array.length-1;i++){
                    if(sum-array[i]==array[index]){
                        System.out.println(index+" "+ i);
                    }
//                    index++;
                }

//        System.out.println(reverse(s));

    }
}
