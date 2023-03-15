package com.apolis.enjoyalgorithm;

// Given an input array height[] representing the heights of buildings, write a program to count the number of
// buildings facing the sunset. It is assumed that heights of all buildings are distinct.
//
// height[]={7,4,8,2,9}  Output: 3

// height[]={2,3,4,5}  Output: 4
public class BuildingsFacingSun {

    private static int facingSunCount(int[] height) {

        int maxHeight=height[0];
        int count=0;

        for (int heights:height){
            if(heights>maxHeight){
                maxHeight=heights;
                continue;
            }else {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] height={7,4,8,2,9};
        System.out.println(facingSunCount(height));
    }
}
