package com.apolis.javapractice;
//Given an integer array nums, find a subarray
//that has the largest product, and return the product.
//The test cases are generated so that the answer will fit in a 32-bit integer.
//
//        Example 1:
//        Input: nums = [2,3,-2,4]
//        Output: 6
//        Explanation: [2,3] has the largest product 6.
//
//        Example 2:
//        Input: nums = [-2,0,-1]
//        Output: 0
//        Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

import java.util.Arrays;

public class MaximumProductSubArray152 {
    private static int maxProduct(int[] nums) {

//        if(nums.length==0){
//            return 0;
//        }
//        if(nums.length==1){
//            return nums[0];
//        }
////        if(nums.length==2){
////            int product=nums[0]*nums[1];
////            if(product>Math.max(nums[0],nums[1])){
////                return product;
////            }
////            return Math.max(nums[0],nums[1]);
////        }
//        int max= Arrays.stream(nums).max().getAsInt();
//
//        for(int i=0;i<nums.length;i++){
//
//            for (int j=i+1;j<nums.length;j++){
//
//                int product=findProduct(nums, i,j);
//                if(product>max){
//                    max=product;
//                }
//            }
//        }
//        return max;
//    }
//
//    private static int findProduct(int[] nums, int i, int j) {
//        int product=nums[i];
////        System.out.println(i+" "+j);
//        for(int x=i+1;x<=j;x++){
////            System.out.println(nums[x]);
//            product=product*nums[x];
////            System.out.println(product);
//        }
//        return product;
        if(nums==null||nums.length==0)
            return 0;

        int maxProduct = nums[0];
        int max_temp = nums[0];
        int min_temp = nums[0];

        for(int i=1;i<nums.length;i++) {
            int a = nums[i]*max_temp;
//            System.out.println("a "+ a);
            int b = nums[i]*min_temp;
//            System.out.println("b "+ b);
            max_temp = Math.max(Math.max(a,b), nums[i]);
//            System.out.println("temp max "+ max_temp);
            min_temp = Math.min(Math.min(a,b), nums[i]);
//            System.out.println("temp min "+min_temp);
            maxProduct = Math.max(maxProduct, max_temp);
//            System.out.println("maximus "+maxProduct);
//            System.out.println("================================================");
        }

        return maxProduct;

    }

    public static void main(String[] args) {
        int[] nums={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
