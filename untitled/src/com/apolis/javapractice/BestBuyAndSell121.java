package com.apolis.javapractice;
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//        Example 1:
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//
//        Example 2:
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.

import java.util.Arrays;

public class BestBuyAndSell121 {
    private static int maxProfit(int[] prices) {
        if(prices.length==0||prices.length==1){

        }
        int maxIndex= findMax(prices);
        int leastIndex=findMin(prices);

        if(leastIndex<maxIndex){
            return prices[maxIndex]-prices[leastIndex];
        }
        else if (leastIndex>maxIndex){
            int[] newArray=Arrays.copyOfRange(prices,leastIndex,prices.length-1);
            int newMaxIndex=findMax(newArray);
            return newArray[newMaxIndex]- newArray[0];
        }
        return prices[maxIndex]-prices[leastIndex];
    }

    private static int findMin(int[] array) {
        int index=0;
        int smallest=array[0];
        for(int i=1;i<array.length;i++){

            if (array[i]<smallest){
                index=i;
            }
        }
        return index;
    }

    private static int findMax(int[] array) {
        int index=0;
        int largest=array[0];
        for(int i=1;i<array.length;i++){
            if (array[i]>largest){
                index=i;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }


}
