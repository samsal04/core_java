package com.apolis.codewars;
//Let's make it so Bob never misses another interesting number. We've hacked into his car's computer,
//and we have a box hooked up that reads mileage numbers.
//We've got a box glued to his dash that lights up yellow or green depending on whether it receives a 1 or a 2 (respectively).
//
//It's up to you, intrepid warrior, to glue the parts together.
//Write the function that parses the mileage number input, and returns a 2 if the number is "interesting" (see below),
//a 1 if an interesting number occurs within the next two miles, or a 0 if the number is not interesting.
//
//        Note: In Haskell, we use No, Almost and Yes instead of 0, 1 and 2.
//        "Interesting" Numbers
//
//        Interesting numbers are 3-or-more digit numbers that meet one or more of the following criteria:
//
//        Any digit followed by all zeros: 100, 90000
//        Every digit is the same number: 1111
//        The digits are sequential, incementing†: 1234
//        The digits are sequential, decrementing‡: 4321
//        The digits are a palindrome: 1221 or 73837
//        The digits match one of the values in the awesomePhrases array
//
//        † For incrementing sequences, 0 should come after 9, and not before 1, as in 7890.
//        ‡ For decrementing sequences, 0 should come after 1, and not before 9, as in 3210.
//
//        So, you should expect these inputs and outputs:
//
//// "boring" numbers
//        CarMileage.isInteresting(3, new int[]{1337, 256});    // 0
//        CarMileage.isInteresting(3236, new int[]{1337, 256}); // 0
//
//// progress as we near an "interesting" number
//        CarMileage.isInteresting(11207, new int[]{}); // 0
//        CarMileage.isInteresting(11208, new int[]{}); // 0
//        CarMileage.isInteresting(11209, new int[]{}); // 1
//        CarMileage.isInteresting(11210, new int[]{}); // 1
//        CarMileage.isInteresting(11211, new int[]{}); // 2
//
//// nearing a provided "awesome phrase"
//        CarMileage.isInteresting(1335, new int[]{1337, 256}); // 1
//        CarMileage.isInteresting(1336, new int[]{1337, 256}); // 1
//        CarMileage.isInteresting(1337, new int[]{1337, 256}); // 2
//
//        Error Checking
//
//        A number is only interesting if it is greater than 99!        2,147,483,647
//        Input will always be an integer greater than 0, and less than 1,000,000,000.
//        The awesomePhrases array will always be provided, and will always be an array, but may be empty. (Not everyone thinks numbers spell funny words...)
//        You should only ever output 0, 1, or 2.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarMileage {
    private static int isIntersting(int number, int[] awesomePhrases) {
        int result=0;
        if(number<=99) return result;

       if(check(number,awesomePhrases)){
           return 2;
       }
       else if(check(number+1,awesomePhrases) || check(number+2,awesomePhrases)){
           return 1;
       }


        return result;
    }

    private static boolean check(int i,int[] awesomeArray) {

        int result=0;

        if(checkZero(i)){
            return true;
        }else if(checkDigit(i)){
            return true;
        } else if (checkSequenceIncrement(i)) {
            return true;
        } else if (checkSequenceDecrement(i)) {
            return true;
        } else if (checkPalindrome(i)) {
            return true;
        }else if(checkList(i,awesomeArray)){
            return true;
        }
        return false;
    }

    private static boolean checkList(int i, int[] array){
        List<Integer> list=Arrays.stream(array).boxed().toList();
//        System.out.println(list+" "+ i);
//      System.out.println(list.contains(i));
        return list.contains(i);
    }

    private static boolean checkPalindrome(int i) {

        String s= String.valueOf(i);
        StringBuilder stringBuilder= new StringBuilder(s);

        return s.equals(stringBuilder.reverse().toString());

    }

    private static boolean checkSequenceDecrement(int i) {
        String s= String.format("%d",i);
        int num=(int)s.charAt(0);

        for (int j=0;j<s.length();j++){

            if((int)s.charAt(j)!=num){
                return false;
            }
            num--;
        }

        return true;
    }

    private static boolean checkSequenceIncrement(int i) {
        String s= String.valueOf(i);
        int num=(int)s.charAt(0);

        for (int j=0;j<s.length();j++){

            if((int)s.charAt(j)!=num){
                return false;
            }
            num++;
        }

        return true;
    }

    private static boolean checkDigit(int i) {
        String s= String.format("%d",i);
//        System.out.println(s);
        char c= s.charAt(0);
        for (int j=0;j<s.length();j++){
            if(s.charAt(j)==c){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    private static boolean checkZero(int i) {
//        int reminder=0;
//        while (i!=0){
//         reminder= i%10;
//         i/=10;
//
//        }
//        if(reminder<=9 && reminder>=0){
//            return true;
//        }
        String s=String.valueOf(i);
        int n=s.length();

        System.out.println(Math.pow(10,n-1));

        if(i% Math.pow(10,n)==0 ){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] awesomePhrases = {1337, 256};
        int number = 112208;

        System.out.println(isIntersting(number,awesomePhrases));
    }
}
