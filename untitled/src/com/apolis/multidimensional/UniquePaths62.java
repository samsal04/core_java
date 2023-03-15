package com.apolis.multidimensional;
//There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
//The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
//The robot can only move either down or right at any point in time.
//
//Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
//The test cases are generated so that the answer will be less than or equal to 2 * 109.
//
//        Example 1:
//        Input: m = 3, n = 7
//        Output: 28
//
//        Example 2:
//        Input: m = 3, n = 2
//        Output: 3
//        Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
//        1. Right -> Down -> Down
//        2. Down -> Down -> Right
//        3. Down -> Right -> Down

public class UniquePaths62 {
    private static int uniquePaths(int m, int n) {

//        int[][] array= new int[m][n];
//        int result=0;
//        int initialRow=0;
//        int initialColumn=0;
//
//        int targetRow=m;
//        int targetColumn=n;
//
//
//        while(initialColumn<targetColumn && initialRow<targetRow) {
//
//
//                    if (initialColumn == targetColumn && initialRow == targetRow) {
//                        result++;
//
//                    } else {
//                        if (initialRow==array[0].length) {
//                            initialColumn++;
//                        }
//                        else if(initialColumn==array.length){
//                            initialColumn++;
//                        }
//                    }
//        }
//
//        return result;
        int[][] grid = new int[m][n];
        for(int row = 0; row < m; row++) {
            for(int col = 0; col < n; col++) {
                if(row == 0 || col == 0) {
                    grid[row][col] = 1;
                }
                else {
                    grid[row][col] = grid[row][col-1] + grid[row-1][col];
                }
            }
        }

        return grid[m-1][n-1];
    }

    public static void main(String[] args) {
        int m=3;
        int n=2;
        System.out.println(uniquePaths(m,n));
    }
}
