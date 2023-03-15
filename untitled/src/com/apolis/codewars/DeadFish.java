package com.apolis.codewars;
//Write a simple parser that will parse and run Deadfish.
//
//        Deadfish has 4 commands, each 1 character long:
//
//        i increments the value (initially 0)
//        d decrements the value
//        s squares the value
//        o outputs the value into the return array
//
//        Invalid characters should be ignored.
//
//        Deadfish.parse("iiisdoso") =- new int[] {8, 64};

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeadFish {
    private static int[] parse(String data) {

        List<Integer> list= new ArrayList<>();
        int value=0;
        for(int i=0;i<data.length();i++){

            if(data.charAt(i)=='i'){
                value++;
            }
            else if(data.charAt(i)=='d'){
                value--;
            }
            else if(data.charAt(i)=='s'){
                value=value*value;
            }
            else if(data.charAt(i)=='o'){
                list.add(value);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        String data="iiisdoso";
        System.out.println(Arrays.toString(parse(data)));
    }
}
