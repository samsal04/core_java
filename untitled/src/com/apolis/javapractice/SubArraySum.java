package com.apolis.javapractice;
//Find the contiguous subarray that add up to a sum given int k (which represents how long subarray is), int [] arr, and int sum)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SubArraySum {
    private static List<Integer> subarraySum(int[] array, int n) {

        List<Integer> list= new ArrayList<>();
//        int left=0;
//        int right=array.length-1;


//        while (left<right){
//
//            if(array[left]+array[right]==n){
//                list.add(array[left]);
//                list.add(array[right]);
//               break;
//            }
//            else if(array[left]+array[right]>n){
//                right--;
//            }else if(array[left]+array[right]<n){
//                left++;
//            }
//
//        }

//       for(int i=0;i<array.length;i++){
//
//           int remain=n- array[i];
//
//           if(check(array,remain,i)){
//               list.add(array[i]);
//               list.indexOf(n-array[i]);
//           }
//
//       }

        Stack<Integer> stack= new Stack<>();
        int index=0;
        for(int i=0;i< array.length;i++){

            if(stack.isEmpty()){
                stack.push(array[i]);
            }else {
                if(array[i]+ stack.get(index)==n){

                }
            }


        }


        return list;
    }

    private static boolean check(int[] array,int remain,int j) {

        for(int i=j;i<array.length;i++){
            if (array[i]==remain){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array={3,4,6,1,8};
        int n= 10;

        System.out.println(subarraySum(array, n));
    }
}
