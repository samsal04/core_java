package com.apolis.javapractice;

// find 3rd minimum value in an array with at least O of N  time complexity
public class ThirdMin {
    private static int thirdMin(int[] nums) {
        Integer min1 = null, min2 = null, min3 = null;
        for (Integer num : nums) {
            if (num.equals(min1) || num.equals(min2) || num.equals(min3)) {
                continue;
            }
            if (min1 == null || num < min1) {
                min3 = min2;
                min2 = min1;
                min1 = num;
            } else if (min2 == null || num < min2) {
                min3 = min2;
                min2 = num;
            } else if (min3 == null || num < min3) {
                min3 = num;
            }
        }
        return min3 == null ? min1 : min3;

    }
    public static void main(String[] args) {

        int[] nums={2,5,1,6,8,10,14};
        System.out.println(thirdMin(nums));
    }
}
