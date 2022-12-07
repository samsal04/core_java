package com.apolis.javapractice;
//Print a given matrix in spiral form.Given a 2D array, print it in spiral form.
//
//        Examples:
//        Input:  {{1,    2,   3,   4},
//                {5,    6,   7,   8},
//                {9,   10,  11,  12},
//                {13,  14,  15,  16 }}
//        Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
//        Explanation: The output is matrix in spiral format.
//
//
//        Input: {{1,   2,   3,   4,  5,   6},
//                {7,   8,   9,  10,  11,  12},
//                {13,  14,  15, 16,  17,  18}}
//        Output: 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
//        Explanation: The output is matrix in spiral format.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class SpiralForm {

    public static void main(String[] args) {
        int[][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int rowPointer=0;
        int columnPointer=0;
        int bottomBoundary=array.length;
        int topBoundary=0;
        int rightBoundary=array[0].length;
        int leftBoundary=0;

        while(topBoundary<=bottomBoundary && leftBoundary<=rightBoundary){

            for(int i=columnPointer;i<rightBoundary;i++){
                columnPointer=i;
                System.out.println(array[rowPointer][columnPointer]);
            }
            topBoundary++;
            System.out.println("rowPointer :"+rowPointer +" columnPointer: "+ columnPointer);


            for(int i=rowPointer;i<bottomBoundary;i++){
                rowPointer=i;
                System.out.println(array[rowPointer][columnPointer]);

            }
            rightBoundary--;

            System.out.println("rowPointer :"+rowPointer +" columnPointer: "+ columnPointer);


            if(columnPointer<=leftBoundary){

                for (int i=columnPointer;i>=0;i--){
                    columnPointer=i;
                    System.out.println(array[rowPointer][columnPointer]);
                }
            }
            bottomBoundary--;
            System.out.println("rowPointer :"+rowPointer +" columnPointer: "+ columnPointer);

            if(columnPointer>=leftBoundary){

                for (int i=rowPointer;i>=0;i--){
                    rowPointer=i;
                    System.out.println(array[rowPointer][columnPointer]);
                }

            }
            leftBoundary++;
            System.out.println("rowPointer :"+rowPointer +" columnPointer: "+ columnPointer);

        }


    }
}
