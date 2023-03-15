package com.apolis.repeated;
//Given an m x n matrix, return all elements of the matrix in spiral order.
//
//        Example 1:
//        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//        Output: [1,2,3,6,9,8,7,4,5]
//
//        Example 2:
//        Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//        Output: [1,2,3,4,8,12,11,10,9,5,6,7]

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list= new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length;
        int rowPointer=0;
        int columnPointer=0;
        int bottomLimit= m-1;
        int rightLimit=n-1;

        while(true){
            // moving right
            for(int i=rowPointer;i<rightLimit;i++){
                rowPointer=i;
                list.add(matrix[rowPointer][columnPointer]);
            }
            if(++rowPointer>rightLimit) break;

            //moving down
            for(int i=columnPointer;i<bottomLimit;i++){
                columnPointer=i;
                list.add(matrix[rowPointer][columnPointer]);
            }
            if(--columnPointer>bottomLimit) break;

            // moving left
            for(int i=rowPointer;i>bottomLimit;i++){
                    rowPointer=i;
                list.add(matrix[rowPointer][columnPointer]);
            }
            if(--columnPointer>bottomLimit) break;


        }
        return list;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}
