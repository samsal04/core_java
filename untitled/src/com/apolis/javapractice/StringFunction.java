package com.apolis.javapractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringFunction {

    public static void main(String[] args) {

        String a = " this is a string";
        String b = " This is another string";

        a.charAt(0);// shows the character at particular place

        b.equals("s");


//        for (int i = 0; i <= a.length(); i++){
//
//            char c = a.charAt(i);
//
//
//
//    }
//        System.out.println(b.split("s").toString());
       Arrays.stream(b.split("s")).forEach(System.out::println);
       b.isBlank();
   //    b.lines().sorted().forEach(System.out::println);

//        List<Integer> listIndex= IntStream.range(0, a.length())
//                .filter(i -> a.charAt(i) == 's').boxed()
//                .collect(Collectors.toList()).;


        System.out.println( IntStream.range(0, a.length())
                .filter(i -> a.charAt(i) == 's').boxed()
                .collect(Collectors.toList()).toString());


        a.split(" ");

        //a.substring(0,);


    }
}
