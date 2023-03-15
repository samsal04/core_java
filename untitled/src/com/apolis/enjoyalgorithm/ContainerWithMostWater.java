package com.apolis.enjoyalgorithm;

//Given an array of n non-negative integers height[n], where each value represents a point at coordinate
//(i,height[i]). Now n vertical lines are drawn such that the two endpoints of line i are at (i,0) and
//(i, height[i]). Here each pair of a line with the x-axis forms a container.
//
//Write a program to find two lines, such that the container contains the most water. We should return an
//integer that corresponds to the maximum area of water that can be contained.
//
//Example:
//
//Input: height={1,5,6,3,4,2}         output=12
public class ContainerWithMostWater {
    private static int area(int[] height) {
        int maxArea=0;
        int left=0;
        int right= height.length-1;

        while (left<right){
            int currArea=(right-left) *Math.min(height[left],height[right]);
            maxArea=Math.max(maxArea,currArea);
            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height={1,5,6,3,4,2};
        System.out.println(area(height));
    }
}
