package com.apolis.codesignal;
//Given an array of positive integers a, your task is to calculate the sum of every possible a[i] ∘ a[j],
//where a[i] ∘ a[j] is the concatenation of the string representations of a[i] and a[j] respectively.
//
//        Example
//
//        For a = [10, 2], the output should be solution(a) = 1344.
//        a[0] ∘ a[0] = 10 ∘ 10 = 1010,
//        a[0] ∘ a[1] = 10 ∘ 2 = 102,
//        a[1] ∘ a[0] = 2 ∘ 10 = 210,
//        a[1] ∘ a[1] = 2 ∘ 2 = 22.
//
//        So the sum is equal to 1010 + 102 + 210 + 22 = 1344.
//
//        For a = [8], the output should be solution(a) = 88.
//
//        There is only one number in a, and a[0] ∘ a[0] = 8 ∘ 8 = 88, so the answer is 88.
//
//        For a = [1, 2, 3], the output should be solution(a) = 198.
//        a[0] ∘ a[0] = 1 ∘ 1 = 11,
//        a[0] ∘ a[1] = 1 ∘ 2 = 12,
//        a[0] ∘ a[2] = 1 ∘ 3 = 13,
//        a[1] ∘ a[0] = 2 ∘ 1 = 21,
//        a[1] ∘ a[1] = 2 ∘ 2 = 22,
//        a[1] ∘ a[2] = 2 ∘ 3 = 23,
//        a[2] ∘ a[0] = 3 ∘ 1 = 31,
//        a[2] ∘ a[1] = 3 ∘ 2 = 32,
//        a[2] ∘ a[2] = 3 ∘ 3 = 33.
//
//        The total result is 11 + 12 + 13 + 21 + 22 + 23 + 31 + 32 + 33 = 198.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatAddition {
    private static long concatAdd(int[] a) {

        List<Long> list= new ArrayList<>();
        for (int k : a) {

            for (int i : a) {
                String s = Integer.toString(k) + Integer.toString(i);
                list.add(Long.valueOf(s));
            }

        }

        return list.stream().mapToLong(Long::longValue).sum();
    }
    public static void main(String[] args) {
        int[] a={10,2};
        System.out.println(concatAdd(a));
    }
}
