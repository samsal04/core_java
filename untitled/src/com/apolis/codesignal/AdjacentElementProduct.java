package com.apolis.codesignal;
//Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
//
//        Example
//        For inputArray = [3, 6, -2, -5, 7, 3], the output should be
//        solution(inputArray) = 21.
//        7 and 3 produce the largest product.
public class AdjacentElementProduct {
    private static int solution(int[] inputArray) {
        int currentProduct=0;
        int maxProduct=Integer.MIN_VALUE;
        int previousNum=inputArray[0];

        for (int i=1;i<inputArray.length;i++){
            currentProduct=previousNum*inputArray[i];
            if(currentProduct>maxProduct){
                maxProduct=currentProduct;
            }
            previousNum=inputArray[i];
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        int[] inputArray={-23, 4, -3, 8, -12};
        System.out.println(solution(inputArray));
    }
}
