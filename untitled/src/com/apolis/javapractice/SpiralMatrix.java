package com.apolis.javapractice;

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


// Incomplete
public class SpiralMatrix {
    private static List<Integer> spiralOrder(int[][] matrix) {


        int rowPointer=0;
        int columnPointer=0;
        int rightLimit= matrix[0].length;
        int leftLimit=0;
        int bottomLimit= matrix.length;
        int topLimit=0;
        List<Integer> list= new ArrayList<>();
        if(matrix == null || matrix.length == 0) return list;

        while(bottomLimit>0 && rightLimit>0){


            // right traversal
            for(int i=leftLimit;i<=rightLimit;i++){
                rowPointer=i;
                list.add(matrix[rowPointer][columnPointer]);
            }
            topLimit++;
            columnPointer++;

            //bottom traversal
            for(int i=topLimit;i<bottomLimit;i++){
                columnPointer=i;
                list.add(matrix[rowPointer][columnPointer]);
            }
            columnPointer--;
            rightLimit--;

            // left traversal
            for (int i=rightLimit;i>leftLimit;i--){
                rowPointer=i;
                list.add(matrix[rowPointer][columnPointer]);
            }
            bottomLimit--;
            rowPointer--;

            // top traversal
            for(int i=bottomLimit;i>topLimit;i--){
                columnPointer=i;
                list.add(matrix[rowPointer][columnPointer]);
            }
            leftLimit++;
            rowPointer++;

        }

        return list;

    }
    public static void main(String[] args) {

        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println(spiralOrder(matrix));
    }
}
