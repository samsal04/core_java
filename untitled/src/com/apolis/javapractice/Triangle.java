package com.apolis.javapractice;
//Given a triangle array, return the minimum path sum from top to bottom.
//For each step, you may move to an adjacent number of the row below.
//More formally, if you are on index i on the current row,
//you may move to either index i or index i + 1 on the next row.
//
//        Example 1:
//        Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
//        Output: 11
//        Explanation: The triangle looks like:
//        2
//        3 4
//        6 5 7
//        4 1 8 3
//        The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
//
//        Example 2:
//        Input: triangle = [[-10]]
//        Output: -10


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Triangle {

    private static int minimumTotal(List<List<Integer>> list) {

        if(list.isEmpty()){
            return 0;
        }
        int sum=list.get(0).stream().mapToInt(Integer::intValue).min().getAsInt();

        for(int i=1;i<list.size();i++){

//                int number=list.get(i).stream().min(Comparator.comparing(Integer::intValue)).get();
//                System.out.println(number);
//                sum=sum+number;




        }

        return sum;
    }
    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> insideList1 = new ArrayList<>();
        List<Integer> insideList2= new ArrayList<>();
        List<Integer> insideList3= new ArrayList<>();
        List<Integer> insideList4= new ArrayList<>();
        insideList1.add(2);
        insideList2.add(3);
        insideList2.add(4);
        insideList3.add(6);
        insideList3.add(5);
        insideList3.add(7);
        insideList4.add(4);
        insideList4.add(1);
        insideList4.add(8);
        insideList4.add(3);

//        insideList.add(6);
//        list.add()
        list.add(insideList1);
        list.add(insideList2);
        list.add(insideList3);
        list.add(insideList4);

        System.out.println(list.toString());
        System.out.println(minimumTotal(list));


    }
}