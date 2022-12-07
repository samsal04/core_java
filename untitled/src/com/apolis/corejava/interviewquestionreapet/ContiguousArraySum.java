package com.apolis.corejava.interviewquestionreapet;
//Given an integer array, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum?
public class ContiguousArraySum {
    public static void main(String[] args) {

        int[] arr = {2,6,3,1,2,3,8,2,9};

        int max= arr[0];
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

            if(sum>max){
                max=sum;
            }if (sum<0){
                sum=0;
            }

        }

        System.out.println(sum);


    }
}
