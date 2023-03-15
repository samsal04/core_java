package com.apolis.repeated;
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//
//        Example 1:
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//
//        Example 2:
//        Input: nums = [0]
//        Output: [0]

import java.util.Arrays;

public class MoveZeroes283 {
    private static void moveZero(int[] nums) {
//
////        int lastNonZero=nums.length-1;
//        int rotate=nums.length-1;
//        int lastIndex=nums.length;
////
////        for (int i=0;i<nums.length;i++){
////
////            if(nums[i]==0 && nums[lastNonZero]!=0){
////                temp=nums[lastNonZero];
////                nums[lastNonZero]=nums[i];
////                nums[i]=temp;
////                lastNonZero--;
////            }
////            else if (nums[i]!=0 && nums[lastNonZero]==0){
////                continue;
////            }
////
////        }
//            int index=0;
//            while (index<lastIndex){
//
//            if(nums[index]==0){
//                rotateArray(Arrays.copyOfRange(nums,index,lastIndex));
//            }
//            index++;
//            lastIndex--;
//        }
//
//
//        System.out.println(Arrays.toString(nums));


        for(int i=0;i< nums.length;i++){

            if (nums[i]==0){
                int temp=0;
                int j=i+1;

                while ( j< nums.length){
                    if(nums[j]!= 0){
                       temp=nums[j];
                        nums[j]=nums[i];
                        nums[i]=temp;
                        break;
                    }
                    else {
                        j++;
                    }

                }

            }

        }

            System.out.println(Arrays.toString(nums));
    }

//    private static int[] rotateArray(int[] nums) {
//            int temp=0;
//
//            for(int i=0;i<nums.length;i++){
//
//                if(i==0){
//                    temp = nums[i];
//                    nums[i]=nums[i+1];
//                }
//                else if(i== nums.length-1) {
//                    nums[i]=temp;
//                }
//                else {
//                    nums[i]=nums[i+1];
//                }
//
//            }
//
//    return nums;
//    }


    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZero(nums);
    }
}
