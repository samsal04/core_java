package com.apolis.javapractice;

import java.util.Arrays;

//Given two sorted arrays nums1 and nums2 of size m and n respectively,\
//return the median of the two sorted arrays.
//The overall run time complexity should be O(log (m+n)).
//
//        Example 1:
//        Input: nums1 = [1,3], nums2 = [2]
//        Output: 2.00000
//        Explanation: merged array = [1,2,3] and median is 2.
//        Example 2:
//
//        Input: nums1 = [1,2], nums2 = [3,4]
//        Output: 2.50000
//        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

/* Logic :
    1) Create a 3 array with nums1.length+ nums2.length
    2) Populate the array with nums1 and nums2.
        i) Flag to check if the nums1 is finished.
        ii) Flag is changed to true when i= nums1.length-1
    3) Sort the newly populated array.
    4) if the nums3 array length is odd, return the middle element of array
    5) if the nums3 array length is even, find the 2 middle elements and send the half value of the addition.

 */
public class MedianOfSortedArrays {
    private static float median(int[] nums1, int[] nums2) {

        int[] nums3= new int[nums1.length+nums2.length];
        boolean num1End=false;
        int nums2Count=0;
        for(int i=0;i<nums3.length;i++){
            if(i==nums1.length){
                num1End=true;
            }
            if(num1End==false){
                nums3[i]=nums1[i];
            }else if(num1End==true && nums2Count<nums2.length){
                nums3[i]=nums2[nums2Count];
                nums2Count++;
            }

        }


        Arrays.sort(nums3);
//        System.out.println(Arrays.toString(nums3));
        if(nums3.length%2==0){

           float l= (nums3[nums3.length/2] + nums3[(nums3.length/2)-1]);
//           System.out.println(nums3[nums3.length/2]);
//            System.out.println(nums3[(nums3.length/2)-1]);
           return l/2;


        }
        else {

            float l= nums3[nums3.length/2];
            return l;
        }

    }
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};

        System.out.println(median(nums1,nums2));
    }
}
