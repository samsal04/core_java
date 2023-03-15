package com.apolis.enjoyalgorithm;
//You are given a row-wise and column-wise sorted 2D matrix and an intger k, write a program to find whether
//the integer k is present in the matrix or not. The matrix has following properties:
//
//-intergers in each row are sorted from left to right
//-the first integer of each row is greate thatn the last integer of the previous row.
//
//Example:
//        int[][] matrix = {{1, 2, 3},
//        {4, 5, 6},
//        {7, 8, 9}};
//        int target = 5;

import java.util.Arrays;

//        int[][] matrix = {{10, 20, 30, 40},
//        {50, 60, 70, 80},
//        {90, 100, 110, 120}};
//        int target = 110;
public class Search2Dmatrix {
    private static int search(int[][] matrix, int target) {

        return Arrays.stream(Arrays.stream(matrix).flatMapToInt(Arrays::stream).toArray())
                .filter(i->i==target)
                .findFirst()
                .getAsInt();


    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int target = 8;

        System.out.println(search(matrix,target));
    }
}
