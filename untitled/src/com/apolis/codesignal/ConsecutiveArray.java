package com.apolis.codesignal;

import java.util.*;

//Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size.
//Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1.
//He may need some additional statues to be able to accomplish that.
//Help him figure out the minimum number of additional statues needed.
//
//        Example
//
//        For statues = [6, 2, 3, 8], the output should be
//        solution(statues) = 3.
//
//        Ratiorg needs statues of sizes 4, 5 and 7.
public class ConsecutiveArray {
    private static int consecutiveArray(int[] statues) {

//        Arrays.sort(statues);
//        int count=statues[0];
//
//        int result=0;
//        for (int i=0;i<statues.length;i++) {
//
//            if(statues[i]!=count) {
//                while (count != statues[i]) {
//                          count++;
//                          result++;
//                }
//            }
//            count++;
//        }
//        return result;
        Set<Integer> sizes= new HashSet<>();
        int minSize= Integer.MAX_VALUE;
        int maxSize=Integer.MIN_VALUE;

        for (int statue: statues){
            sizes.add(statue);
            minSize=Math.min(statue,minSize);
            maxSize=Math.max(statue,maxSize);
        }
//        System.out.println(sizes);
        int count=0;
        for (int i=minSize; i<=maxSize;i++){

            if(!sizes.contains(i)){
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        int[] statues={6, 2, 3, 8};
        System.out.println(consecutiveArray(statues));
    }
}
