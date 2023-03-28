package com.apolis.codesignal;
//You are given an array of integers a and an integer k.
//Your task is to calculate the number of ways to pick two different indices i < j, such that a[i] + a[j] is divisible by k.
//
//        Example
//
//        For a = [1, 2, 3, 4, 5] and k = 3, the output should be solution(a, k) = 4.
//        There are 4 pairs of numbers that sum to a multiple of k = 3:
//        a[0] + a[1] = 1 + 2 = 3
//        a[0] + a[4] = 1 + 5 = 6
//        a[1] + a[3] = 2 + 4 = 6
//        a[3] + a[4] = 4 + 5 = 9

import java.util.HashMap;
import java.util.Map;

public class NoOfDevisibility {
    private static int solution(int[] a, int k) {
        if (a.length == 0 || k == 0) {
            return 0;
        }
        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int j : a) {
            int rem = j % k;
            int complement = (k - rem) % k;
            count += freq.getOrDefault(complement, 0);
            freq.put(rem, freq.getOrDefault(rem, 0) + 1);
        }
        return count;
        }


    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5};
        int k=3;
        System.out.println(solution(a,k));
    }
}
