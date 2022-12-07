package com.apolis.javapractice;

import java.util.Arrays;
import java.util.List;

public class ThreeDigitsPrint {
    private static int[] checkNoDigits(int[] nums) {

       return Arrays.stream(nums).filter(n->n>=99).toArray();


    }

    public static void main(String[] args) {

        int[] nums={88,192,152,26,778,12334,12};

        System.out.println(Arrays.toString(checkNoDigits(nums)));
    }
}
