package com.apolis.codewars;
//Write a function that takes a positive integer and returns the next smaller positive integer containing the same digits.
//
//        For example:
//
//        nextSmaller(21) == 12
//        nextSmaller(531) == 513
//        nextSmaller(2071) == 2017
//
//        Return -1 (for Haskell: return Nothing, for Rust: return None),
//        when there is no smaller number that contains the same digits.
//        Also return -1 when the next smaller number with the same digits would require the leading digit to be zero.
//
//        nextSmaller(9) == -1
//        nextSmaller(111) == -1
//        nextSmaller(135) == -1
//        nextSmaller(1027) == -1 // 0721 is out since we don't write numbers with leading zeros
//
//        some tests will include very large numbers.
//        test data only employs positive integers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextSmallNum {
    private static long nextSmaller(long n) {

        if(n<0){
            return -1;
        }

        List<Integer> digits= new ArrayList<>();
        while(n>0){
            digits.add((int) (n%10));
            n/=10;
        }
        System.out.println(digits);
        Collections.reverse(digits);
        System.out.println(digits);
        int pivot=-1;
        for(int i= digits.size()-2;i>=0;i--){

            if(digits.get(i)> digits.get(i+1)){
                pivot=i;
                break;
            }

        }
        if(pivot==-1){
            return -1;
        }

        int replacement=-1;
        for (int i=digits.size()-1;i>pivot;i--){
            if(digits.get(i)< digits.get(pivot)){
                replacement=i;
                break;
            }
        }

        int temp=digits.get(replacement);
        digits.set(replacement, digits.get(pivot));
        digits.set(pivot,temp);

        List<Integer> tail= digits.subList(pivot+1,digits.size());
        System.out.println(tail);
        tail.sort(Collections.reverseOrder());
        System.out.println(tail);

        long result=0;
        for (int i=0;i<digits.size();i++){
            if(i==0 && digits.get(i)==0){
                return -1;
            }
            result=result*10+ digits.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        long n=709;
        System.out.println(nextSmaller(n));
    }
}
