package com.apolis.multidimensional;
//Covid-Matrix problem.
//
//        [[2, 1, 1, 0, 1],     [[ 2  2  1  0  1]
//        [0, 1, 0, 1, 0],       [ 0  1  0  2  0]
//        [0, 0, 0, 2, 1],  =>   [ 0  0  0  2  2]
//        [0, 1, 0, 2, 2]]       [ 0  1  0  2  2]]
//        0: clear zone
//        1:  humans
//        2: infection
//
//        0’s are clear zone,1’s are human and 2’s are virus.2 can infect all the 1’s surrounded by it.
public class CovidMatrix2 {
    private static void check(int[][] matrix) {

        int rowNumber= matrix.length;
        int columnNumber= matrix[0].length;

            for(int i=0;i<matrix.length;i++){

                for (int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j]==2){

                        fill(matrix, i - 1, j);
                        fill(matrix, i + 1, j);
                        fill(matrix, i, j - 1);
                        fill(matrix, i, j + 1);
                    }
                }
            }

        for(int i=0;i<matrix.length;i++){

            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }

    private static void fill(int[][] matrix, int x, int y) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length) {
            return;
        }
        System.out.println(matrix[x][y]);
        if (matrix[x][y] == 1) {
            matrix[x][y] = 2;
            fill(matrix, x - 1, y);
            fill(matrix, x + 1, y);
            fill(matrix, x, y - 1);
            fill(matrix, x, y + 1);
        }
//        else if(matrix[x][y]==2){
//            fill(matrix, x - 1, y);
//            fill(matrix, x + 1, y);
//            fill(matrix, x, y - 1);
//            fill(matrix, x, y + 1);
//        }
    }

    public static void main(String[] args) {
        int[][] matrix={{2, 1, 1, 0, 1},{0, 1, 0, 1, 0},{0, 0, 0, 2, 1},{0, 1, 0, 2, 2}};
        check(matrix);
    }
}
