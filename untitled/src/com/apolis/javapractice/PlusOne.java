package com.apolis.javapractice;
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
//The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.
//
//        Example 1:
//        Input: digits = [1,2,3]
//        Output: [1,2,4]
//        Explanation: The array represents the integer 123.
//        Incrementing by one gives 123 + 1 = 124.
//        Thus, the result should be [1,2,4].
//
//        Example 2:
//        Input: digits = [4,3,2,1]
//        Output: [4,3,2,2]
//        Explanation: The array represents the integer 4321.
//        Incrementing by one gives 4321 + 1 = 4322.
//        Thus, the result should be [4,3,2,2].
//
//        Example 3:
//        Input: digits = [9]
//        Output: [1,0]
//        Explanation: The array represents the integer 9.
//        Incrementing by one gives 9 + 1 = 10.
//        Thus, the result should be [1,0].


import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusOne {
    private static int[] number(int[] array){


        for(int i=array.length-1;i>=0;i++){
            if(array[i]<9){
                array[i]++;
                return array;
            }
            array[i]=0;
        }
        int[] newArray= new int[array.length+1];
        newArray[0]=1;
        return newArray;


//        for (int i=0;i<array.length;i++){
//
////            if (array[i]==9){
////                int[] array1= new int[array.length+1];
////
////            }
//           if (i==array.length-1 && array[i]!=9){
//                array[i]=array[i]+1;
//            }
//           else if (array[array.length-1]==9){
//               checkprevious(array, i-1);
//            }
//        }
//        return array;
    }

//    private static int[] checkprevious(int[] array,int index) {
//
//            if (index-1==0){
//                String[] arrayNew= new String[array.length+1];
//                arrayNew= new String[]{array.toString(), "0"};
//            }
////        if (index-1>=0 && array[index-1]!=9){
////            array[index]=0;
////            array[index-1]=array[index-1]+1;
////        }
////        else if (index-1>=0 && array[index-1]==9){
////            array[index]=0;
////            array[index-1]=0;
////            checkprevious(array,index-1);
////        }
//
//        return array;
//    }


    public static void main(String[] args) {
        int[] array= {1,2,9};
        number(array);
        int[] newArray=new int[number(array).length];
        newArray= number(array);

        for(int i=0;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }
}
