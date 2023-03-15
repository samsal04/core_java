package com.apolis.stringmanipulation;
//You are given an array of n strings strs, all of the same length.
//The strings can be arranged such that there is one on each line, making a grid. For example, strs = ["abc", "bce", "cae"] can be arranged as:
//
//        abc
//        bce
//        cae
//
//You want to delete the columns that are not sorted lexicographically.
//In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted while column 1 ('b', 'c', 'a') is not, so you would delete column 1.
//
//Return the number of columns that you will delete.
//
//        Example 1:
//        Input: strs = ["cba","daf","ghi"]
//        Output: 1
//        Explanation: The grid looks as follows:
//        cba
//        daf
//        ghi
//        Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.
//
//        Example 2:
//        Input: strs = ["a","b"]
//        Output: 0
//        Explanation: The grid looks as follows:
//        a
//        b
//        Column 0 is the only column and is sorted, so you will not delete any columns.
//
//        Example 3:
//        Input: strs = ["zyx","wvu","tsr"]
//        Output: 3
//        Explanation: The grid looks as follows:
//        zyx
//        wvu
//        tsr
//        All 3 columns are not sorted, so you will delete all 3.

public class DeleteColumnToSort944 {
    public static int minDeletionSize(String[] strs) {
//        int result=0;
//        int row= strs[0].length();
//        int column= strs.length;
//
////        for (int i=0;i<strs.length;i++){
////
////            for (int j=0; j< ){
////
////            }
////
////        }
//
//        return result;
        int result = 0;

        // column is fixed
        for (int col = 0;  col < strs[0].length(); col++) {
            // gonna go over each row and check each character on that row related to the column
            for(int row = 0; row < strs.length-1; row++) {
                if(strs[row].charAt(col) > strs[row+1].charAt(col)) {
                    result += 1;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String[] strs= {"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }
}
