package com.apolis.practicecodes;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    private static List<Integer> primeFactor(int n) {

        List<Integer> list= new ArrayList<>();

        while(n%2==0){
            n/=2;
            list.add(2);
        }

        for(int i=3;i<Math.sqrt(n);i+=2){
            while(n%i==0){
                n/=i;
                list.add(i);
            }
        }

        if(n>2){
            list.add(n);
        }
        return list;
    }
    public static void main(String[] args) {
        int n=315;
        System.out.println(primeFactor(n));
    }
}
