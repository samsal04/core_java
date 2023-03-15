package com.apolis.enjoyalgorithm;

//Given n non-negative integers representing an elevation map where the width of each tower is 1.
//Write a program to compute how much water it can trap after raining.class
//
//Example:
//Input: height={0,1,0,2,1,0,1,3,2,1,2,1}         Output=6
public class RainWaterTrapping {
    private static int water(int[] height) {

        int trappedWater=0;
        int leftMax=0;
        int rightMax=0;
        int left=0;
        int right=height.length-1;

        while(left<=right){
            if(height[left]<height[right]){
                if(height[left]>leftMax){
                    leftMax=height[left];
                }
                else{
                    trappedWater=trappedWater+leftMax-height[left];
                    left++;
                }
            }
            else {
                if(height[right]>rightMax){
                    rightMax=height[right];
                }
                else {
                    trappedWater=trappedWater+rightMax-height[right];
                    right--;
                }
            }
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(water(height));
    }
}
