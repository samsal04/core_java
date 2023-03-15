package com.apolis.enjoyalgorithm;

import java.util.Stack;

//You are given an array of 1s and 0s and you are given an integer k which signifies the number of flips allowed.
//Write a program to return the count of the maximum number of consecutive 1's in the array if you can flip at
//most k 0's.
//
//Exmaple:
//Input: array={1,0,0,1,1,0,1,0,1,1,1}    k=2,        Output: 8
//Input: array={1,1,0,1,0,1,0,0,1}        k=1,        Output=4
public class MaxContinuous1 {
    private static int maxArray(int[] array, int k) {
//        int max=0;
//        int start=0;
//        int end=start+1;
//        int currentCount=0;
//        int count=k;
//        Stack<Integer> stack= new Stack<>();
//        while(end<array.length){
//
//            if(array[end]==1){
//                stack.push(array[end]);
//                end++;
//                currentCount++;
//            }else if(array[end]==0 && count>0){
//                stack.push(1);
//                end++;
//                currentCount++;
//                count--;
//            }else if (array[end]==0 && count==0){
//               max=Math.max(currentCount,max);
//                currentCount=0;
//                stack.clear();
//                count=k;
//                start++;
//                end=start+1;
//            }
//
//        }
        int zeroCount=0;
        int l=0;
        int maxOneCount=0;
        for (int i=0;i<array.length;i++){

            if(array[i]==0){
                zeroCount=zeroCount+1;
            }
            if(zeroCount>k){
                if(array[i]==0){
                    zeroCount--;
                }
                l=l+1;
            }
            maxOneCount=Math.max(maxOneCount,i-l+1);
        }


        return maxOneCount;
    }
    public static void main(String[] args) {
        int[] array={1,0,0,1,1,0,1,0,1,1,1};
        int k=2;
        System.out.println(maxArray(array,k));
    }
}
