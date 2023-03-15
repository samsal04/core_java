package com.apolis.multidimensional;
// 1   2  4  5
// 6   7  8  9  =>
// 10 11 15 17
// 18 20 25 30

// 1 2 4 5 9 17 30 25 20 18 10 6 7 8 15 11
//

import java.util.ArrayList;
import java.util.List;

public class SpiralRotation {
    private static List<Integer> rotate(int[][] matrix) {

        int m= matrix.length;
        int n= matrix[0].length;
        int rowPointer=0;
        int columnPointer= 0;
        int rightLimit= m;
        int leftLimit=0;
        int topLimit=0;
        int bottomLimit=n;
        List<Integer> list= new ArrayList<>();

        while(leftLimit<= rightLimit && topLimit <= bottomLimit){

            for(int i=0;i<rightLimit;i++){
                rowPointer=i;
                if(list.contains(matrix[columnPointer][rowPointer])){
                    continue;
                }
                list.add(matrix[columnPointer][rowPointer]);
            }
            topLimit++;
            columnPointer++;
            if(columnPointer>bottomLimit) break;

            for(int i=0;i<bottomLimit;i++){
                columnPointer=i;
                if(list.contains(matrix[columnPointer][rowPointer])){
                    continue;
                }
                list.add(matrix[columnPointer][rowPointer]);
            }
            rightLimit--;
            rowPointer--;
            if(rowPointer<leftLimit) break;


            for(int i=rightLimit;i>=0;i--){
                rowPointer=i;
                if(list.contains(matrix[columnPointer][rowPointer])){
                    continue;
                }
                list.add(matrix[columnPointer][rowPointer]);
            }
            bottomLimit--;
            columnPointer--;
            if(columnPointer<topLimit) break;

            for(int i=bottomLimit;i>=0;i--){
                columnPointer=i;
                if(list.contains(matrix[columnPointer][rowPointer])){
                    continue;
                }
                list.add(matrix[columnPointer][rowPointer]);
            }
            leftLimit++;
            columnPointer++;
            if(rowPointer>rightLimit) break;


        }

        return list;
    }
    public static void main(String[] args) {

        int[][] matrix={{1,2,4,5},{6,7,8,9},{10,11,15,17},{18,20,25,30}};
        System.out.println(rotate(matrix));
    }
}
