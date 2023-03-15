package com.apolis.applecode;
// find the contiguous array of length k with given sum.
import java.util.Arrays;

public class SubArraySum {
    private static int[] subArraySum(int[] arr, int sum, int k) {
        int[] result = new int[k];
        int currentSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentSum += arr[windowEnd];
            if (windowEnd - windowStart + 1 == k) {
                if (currentSum == sum) {
                    for (int i = 0; i < k; i++) {
                        result[i] = arr[windowStart + i];
                    }
                    return result;
                }
                currentSum -= arr[windowStart];
                windowStart++;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        int[] arr={3,4,6,1,8,9,12};
        int sum=11;
        int k=3;
        System.out.println(Arrays.toString(subArraySum(arr,sum,k)));
    }
}
