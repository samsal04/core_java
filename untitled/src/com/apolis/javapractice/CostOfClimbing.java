package com.apolis.javapractice;
//You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
//Once you pay the cost, you can either climb one or two steps.
//You can either start from the step with index 0, or the step with index 1.
//Return the minimum cost to reach the top of the floor.
//
//        Example 1:
//        Input: cost = [10,15,20]
//        Output: 15
//        Explanation: You will start at index 1.
//        - Pay 15 and climb two steps to reach the top.
//        The total cost is 15.
//
//        Example 2:
//        Input: cost = [1,100,1,1,1,100,1,1,100,1]
//        Output: 6
//        Explanation: You will start at index 0.
//        - Pay 1 and climb two steps to reach index 2.
//        - Pay 1 and climb two steps to reach index 4.
//        - Pay 1 and climb two steps to reach index 6.
//        - Pay 1 and climb one step to reach index 7.
//        - Pay 1 and climb two steps to reach index 9.
//        - Pay 1 and climb one step to reach the top.
//        The total cost is 6.
//   optimise

public class CostOfClimbing {
    private static int cost(int[] array){



       for(int i=2;i<array.length;i++){

           array[i]+= Math.min(array[i-1],array[i-2]);


       }

       return Math.min(array[array.length-1],array[array.length-2] );
    }
    public static void main(String[] args) {
        int[] array={1,100,1,1,1,100,1,1,100,1};
        int[] array1={10,15,20};
        System.out.println(cost(array));
        System.out.println(cost(array1));
    }
}
//    public static int calculateMinJumps(int flagHeight, int maxJump) {
//        int jumps = flagHeight / maxJump; // calculate the number of jumps required to reach maxJump distance from the ground level
//        if (flagHeight % maxJump != 0) { // if the climber can't reach the flag with maxJump distance, add one more jump
//            jumps++;
//        }
//        return jumps;
//    }
