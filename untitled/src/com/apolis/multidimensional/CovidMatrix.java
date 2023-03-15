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

public class CovidMatrix {
    private static void check(int[][] matrix) {

        int cycles=0;
        int unaffected=0;
        boolean visited=false;
        int m= matrix.length;
        int n= matrix[0].length;
        int rowPointer=0;
        int columnPointer= 0;
        int rightLimit= m;
        int leftLimit=0;
        int topLimit=0;
        int bottomLimit=n;



        while(rowPointer<m && columnPointer<n){

            if (rowPointer==0 && rowPointer--<leftLimit){
                changeTop(matrix,rowPointer,columnPointer);
                changeBottom(matrix,rowPointer,columnPointer);
//                changeRight(matrix,rowPointer,columnPointer);
//                changeLeft(matrix,rowPointer,columnPointer);
            }

            if(matrix[columnPointer][rowPointer]==2){
//                changeOne(columnPointer,rowPointer,matrix,rightLimit,leftLimit,topLimit,bottomLimit);
            }
            columnPointer++;
            rowPointer++;
            if(columnPointer++>bottomLimit) break;
            if(rowPointer++>rightLimit) break;

        }

        for(int i=0;i<m;i++){

            for (int j=0;j<n;j++){
                System.out.print(matrix[i][j]);
            }
        }

    }

    private static void changeTop(int[][] matrix, int rowPointer, int columnPointer) {

        if(columnPointer-- < 0){
            for(int i= columnPointer; i>0;i--){
                if(matrix[columnPointer][rowPointer]==1 && (matrix[columnPointer++][rowPointer]==1 || matrix[columnPointer++][rowPointer]==2) ){

                    matrix[columnPointer][rowPointer]=2;
                }
            }
        }

    }
    private static void changeBottom(int[][] matrix, int rowPointer, int columnPointer) {

        if(columnPointer++ > matrix.length){
            for(int i= columnPointer; i< matrix.length;i++){
                if(matrix[columnPointer][rowPointer]==1 && (matrix[columnPointer--][rowPointer]==1 || matrix[columnPointer--][rowPointer]==2) ){

                    matrix[columnPointer][rowPointer]=2;
                }
            }
        }

    }

//    private static void changeOne(int columnPointer, int rowPointer, int[][] matrix, int rightLimit, int leftLimit, int topLimit, int bottomLimit) {
//        // check top
//        if((columnPointer--<topLimit) ){
//            if(matrix[columnPointer--][rowPointer]==1){
//                matrix[columnPointer--][rowPointer]=2;
//            }
//        }
//
//        // check right
//        if((rowPointer++>leftLimit) ){
//            if(matrix[columnPointer][rowPointer++]==1){
//                matrix[columnPointer][rowPointer++]=2;
//            }
//        }
//
//        //check bottom
//        if((columnPointer++>bottomLimit) ){
//            if(matrix[columnPointer++][rowPointer]==1){
//                matrix[columnPointer++][rowPointer]=2;
//            }
//        }
//
//        //check left
//        if((rowPointer--<leftLimit) ){
//            if(matrix[columnPointer][rowPointer--]==1){
//                matrix[columnPointer][rowPointer--]=2;
//            }
//        }
//    }


    public static void main(String[] args) {
        int[][] matrix={{2, 1, 1, 0, 1},{0, 1, 0, 1, 0},{0, 0, 0, 2, 1},{0, 1, 0, 2, 2}};
        check(matrix);
    }
}
