package com.apolis.codesignal;
//Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence
// by removing no more than one element from the array.
//
//        Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an.
//        Sequence containing only one element is also considered to be strictly increasing.
//
//        Example
//
//        For sequence = [1, 3, 2, 1], the output should be
//        solution(sequence) = false.
//
//        There is no one element in this array that can be removed in order to get a strictly increasing sequence.
//
//        For sequence = [1, 3, 2], the output should be
//        solution(sequence) = true.
//
//        You can remove 3 from the array to get the strictly increasing sequence [1, 2].
//        Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

import java.util.Arrays;

public class StrictlyAscending {
    private static boolean checkSequence(int[] sequence) {
        boolean flag= false;
//        Arrays.sort(sequence);
        int count= sequence[0];
        System.out.println(Arrays.toString(sequence)+ "   "+ count);

        for (int i=0;i< sequence.length;i++){
            if(!flag && count!= sequence[i]){
                flag=true;
                continue;
            }
            else if(!flag && count!= sequence[i] ){
                return false;
            }

        }

        return true;
    }
    public static void main(String[] args) {
        int[] sequence={1, 3, 2, 1};
        System.out.println(checkSequence(sequence));
    }
}
