package com.apolis.multidimensional;
//In MATLAB, there is a handy function called reshape which can reshape an m x n matrix
//into a new one with a different size r x c keeping its original data.
//You are given an m x n matrix mat and two integers r and c representing the number of
//rows and the number of columns of the wanted reshaped matrix.
//The reshaped matrix should be filled with all the elements of
//the original matrix in the same row-traversing order as they were.
//If the reshape operation with given parameters is possible and legal,
//output the new reshaped matrix; Otherwise, output the original matrix.
//
//        Input: mat = [[1,2],[3,4]], r = 1, c = 4
//        Output: [[1,2,3,4]]
//
//        Input: mat = [[1,2],[3,4]], r = 2, c = 4
//        Output: [[1,2],[3,4]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReshapeMatrix566 {
    private static int[][] matrixReshape(int[][] nums, int r, int c) {

//        if(r==mat[0].length && c== mat.length){
//            return mat;
//        }
//
//        if (r*c != mat[0].length*mat.length){
//            return mat;
//        }
////        System.out.println(mat[0].length);
////        System.out.println(mat.length);
//
//
//        int[][] newMatrix= new int[r][c];
////        List<Integer> list= new ArrayList<>();
////
////        for(int i=0;i<mat.length;i++){
////
////            for(int j = 0; j<mat[0].length; j++){
////
////                list.add(mat[i][j]);
////
////            }
////        }
////
////        System.out.println(list.size());
////
////
////        int count=0;
////        for(int i=0;i<newMatrix.length && i<list.size();i++){
////
////            for (int j=0;j<newMatrix[0].length && j<list.size();j++){
////
////                newMatrix[i][j]=list.get(count);
////                count++;
////
////            }
////
////        }
//
////        for(int i=0;i<r;i++){
////
////            for (int j=0;j<c;j++){
////
////              System.out.println(newMatrix[i][j]);
////            }
////
////        }
//
//        int row=0;
//        int column=0;
//
//        for(int i=0;i< mat.length;i++){
//
//            for (int j=0;j<mat[0].length;j++){
//
//                newMatrix[row][column]=mat[i][j];
//
//                if(i>r){
//                    row++;
//                    column=0;
//                }
//                column++;
//
//            }
//
//        }
//
//
//        return newMatrix;
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;

        int[][] ans = new int[r][c];
        int k = 0;

        for (int[] row : nums)
            for (final int num : row) {
                ans[k / c][k % c] = num;
                ++k;
            }

        return ans;
    }
    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int r=1;
        int c=4;


        System.out.println(matrixReshape(mat,r,c));
    }
}
