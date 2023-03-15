package com.apolis.multidimensional;

import java.util.Arrays;
import java.util.stream.Collectors;

//Write a function that takes a matrix (2D array) of integers and returns the maximum element in the matrix.
//Write a function that takes a matrix (2D array) of integers and returns the transpose of the matrix.
public class MaxIn2D {
    private static int max(int[][] arr) {
        int max=0;

        for (int i=0;i<arr.length;i++){

            for (int j=0;j<arr[0].length;j++){

                if(arr[i][j]>max){
                    max=arr[i][j];
                }

            }
       }
        return max;
    }

    private static int[][] transpose(int[][] arr) {

        int[][] matrix= new int[arr[0].length][arr.length];

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++) {

                matrix[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++) {

                System.out.println(matrix[i][j]+ " ");
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] arr= {{1,2,5},{5,3,5},{6,12,9},{2,20,3}};
        System.out.println(max(arr));
        System.out.println(Arrays.toString(transpose(arr)));
    }
}
