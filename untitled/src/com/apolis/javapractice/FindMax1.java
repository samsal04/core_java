package com.apolis.javapractice;

//IN a 2D array, having non negative values, find the row with max numbers of 1
//        Input:
//        N = 4 , M = 4
//        Arr[][] = {{0, 1, 1, 1},
//        {0, 4, 1, 9},
//        {1, 1, 1, 1},
//        {0, 0, 0, 0}}
//        Output: 2
//        Explanation: Row 2 contains 4 1's (0-based
//        indexing)


public class FindMax1 {
    private static int findMax(int[][] arr) {

//        int count=0;
        int maxCount=0;
        int result=0;

//        System.out.println(arr.length);
//        System.out.println(arr[0].length);

        for(int i=0;i< arr.length;i++){
                int count=0;
            for(int j=0;j<arr[0].length;j++){

                if(arr[i][j]==1){

                    count++;
                }

            }
            if(count >maxCount){
                maxCount=count;
                result=i;
            }

        }


    return result;
    }
    public static void main(String[] args) {

        int[][] arr=  {{0, 1, 1, 1},
        {0, 4, 1, 9},
        {1, 1, 1, 1},
        {0, 0, 0, 0}};

        System.out.println(findMax(arr));

    }
}
