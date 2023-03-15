package com.apolis.applecode;

import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

// It ask you to predict the N position of an array starting from 0
//
//        each time copy the old array and change it
//
//        0->1,1->2,2->0
//
//        0->01->0120
//
//        like this
public class KrogersCode {
//    private static int[] predictNthPosition(int[] array,int n) {
////        int[] newArray= array.clone();
//
////        for (int i=0;i<n;i++){
////            for (int j=0;j<array.length;j++){
////
////                newArray[j]=array[newArray[j]];
////            }
////            array= newArray.clone();
////            System.out.println(Arrays.toString(array));
////            System.out.println(Arrays.toString(newArray));
////            System.out.println("=====================");
////        }
//        int sum=array[0];
//
////        for(int i=0;i<array.length;i++){
////
////            sum+=array[i];
////            newArray[i]=sum;
////
////        }
//        int[] newArray= new int[n];
//        for(int i=0;i<n;i++){
//
//            newArray[i]=getNum(array,i);
//
//        }
//
//        return newArray;
//    }

//    private static int getNum(int[] array, int n) {
//        int num=0;
//        StringBuilder stringBuilder= new StringBuilder();
//        for(int i=0;i<n;i++){
//
//            stringBuilder.append(array[i]);
//
//        }
//        if(stringBuilder.toString().equals("")){
//            return 0;
//        }
//        return Integer.parseInt(String.valueOf(stringBuilder));
//    }

    public static void main(String[] args) {
//        int[] array={0,1,2,0};
        int initialNum=0;
        int nthPosition=10;
        System.out.println(Arrays.toString(predictNthPosition(nthPosition,initialNum)));
        int[] newArray=predictNthPosition(nthPosition,initialNum);
        RandomGenerator randomGenerator= new Random();
        int num=randomGenerator.nextInt(newArray.length);
        System.out.println("random :"+num);
        System.out.println(Arrays.toString(getNewArray(newArray,num)));
    }

    private static int[] getNewArray(int[] newArray, int num) {


        int[] array= new int[newArray.length];

        for(int i=0;i<num;i++){

            array[i]= getValue(newArray,i);
        }


        return array;
    }

    private static int getValue(int[] newArray, int n) {
        StringBuilder stringBuilder= new StringBuilder();
        for (int i=0;i<n;i++){
            stringBuilder.append(newArray[i]);
        }
        if(stringBuilder.toString().equals("")){
            return 0;
        }
        return Integer.valueOf(stringBuilder.toString());
    }

    private static int[] predictNthPosition(int nthPosition, int initialNum) {

        int[] array= new int[nthPosition];

        for (int i=0;i<array.length;i++){
//            if(i<(array.length)/2){
//                array[i]=initialNum++;
//            }else {
//                array[i]=initialNum--;
//            }
            if(i==array.length-1){
                array[i]=0;
            }
            else {
                array[i]=initialNum++;
            }
        }

        return array;
    }
}
