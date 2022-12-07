package com.apolis.javapractice;

//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,\
//find two numbers such that they add up to a specific target number.
//Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//The tests are generated such that there is exactly one solution. You may not use the same element twice.
//Your solution must use only constant extra space.
//
//        Example 1:
//        Input: numbers = [2,7,11,15], target = 9
//        Output: [1,2]
//        Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
//
//        Example 2:
//        Input: numbers = [2,3,4], target = 6
//        Output: [1,3]
//        Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
//
//        Example 3:
//        Input: numbers = [-1,0], target = -1
//        Output: [1,2]
//        Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2]

import java.util.Arrays;

public class TwoSum167 {
    private static int[] twoSum(int[] nums, int target) {

//        int[] solution= new int[2];
//
//        for(int i=0;i<nums.length;i++){
//
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]+nums[j]==target){
//                    solution[0]=i+1;
//                    solution[1]=j+1;
//                    return solution;
//                }
//                else{
//                    continue;
//                }
//            }
//        }
//        return solution;
//        int[] solution= new int[2];
//        int index=0;
//        for(int i=0;i<nums.length;i++){
//            int number= target-nums[i];
//
//           index= findIndex(nums,number);
//           if(index==-1){
//               continue;
//           }else {
//               solution[0]=index+1;
//               solution[1]=i+1;
//               return solution;
//
//           }
//
//        }
//
//       return solution;

        int right=nums.length-1;
        int left=0;
        int[] solution= new int[2];

        while(left<right){

//            System.out.println(nums[left] + " "+ nums[right]);
            if(target== nums[left]+nums[right]){
                solution[0]=left+1;
                solution[1]=right+1;
                break;
            }
            else if (target<nums[left]+nums[right]){
                right--;
            }else if (target>nums[left]+nums[right]){
                left++;
            }
        }
        return solution;
    }

//    private static int findIndex(int[] nums,int number) {
//
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]==number){
//                return i;
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {

        int[] nums= {2,3,4};
        int target=6;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }


}
