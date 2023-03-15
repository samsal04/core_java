package com.apolis.multidimensional;
//
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

//
//        List<Integer> list = new ArrayList<>();
//        int rightBoundary= matrix[0].length;
//        int bottomBoundary= matrix.length;
//        int top=0;
//        int left=0;
//        int rowPointer=0;
//        int columnPointer=0;
//
//       while(rightBoundary>0 && bottomBoundary>0){
//
//            // going right
//           for(int j=0;j<rightBoundary;j++){
//
//               columnPointer=j;
//               list.add(matrix[rowPointer][columnPointer]);
//           }
//           System.out.println("Right end : row pointer :"+rowPointer+" columnPointer"+columnPointer);
//           rowPointer--;
//           top++;
//
//           //going bot
//           for(int i=0;i<bottomBoundary;i++){
//
//               rowPointer=i;
//               list.add(matrix[rowPointer][columnPointer]);
//           }
//           columnPointer--;
//           rightBoundary--;
//           System.out.println("bot end : row pointer :"+rowPointer+" columnPointer"+columnPointer);
//
//           // moving left
//           for(int i=columnPointer;i>=left;i--){
//
//               columnPointer=i;
//               list.add(matrix[rowPointer][columnPointer]);
//           }
//           columnPointer--;
//           bottomBoundary--;
//           System.out.println("left end : row pointer :"+rowPointer+" columnPointer"+columnPointer);
//
//
//           //moving up
//           for (int i=rowPointer;i>=top;i--){
//
//               rowPointer=i;
//               list.add(matrix[rowPointer][columnPointer]);
//           }
//           rowPointer--;
//           left++;
//           System.out.println("top end : row pointer :"+rowPointer+" columnPointer"+columnPointer);
//
//
//       }
//
//       return list;
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0 ||matrix[0].length == 0) return res;

        int m = matrix.length;
        int n = matrix[0].length;

        // p2= no. of rows-1
        // q2= no. of columns-1

        // p1 = row pointer
        // q1= column pointer


        int p1 = 0, q1 = 0;
        int p2 = m-1, q2 = n-1;

        System.out.println(m);

        while(true){
            for(int k= q1; k<=q2; k++){
                res.add(matrix[p1][k]);
            }
            if(++p1 > p2) break;

            for(int k=p1; k <=p2;k++){
                res.add(matrix[k][q2]);
            }
            if(--q2 < q1) break;

            for(int k=q2; k>=q1;k--){
                res.add(matrix[p2][k]);
            }
            if(--p2 < p1) break;

            for(int k=p2; k>=p1; k--){
                res.add(matrix[k][q1]);
            }
            if(++q1 > q2) break;
        }
        return res;
    }

    public static void main(String[] args) {

        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(spiralOrder(matrix));
    }
}
