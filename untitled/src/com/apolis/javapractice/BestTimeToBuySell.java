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

public class BestTimeToBuySell {
    private static int maxProfit(int[] prices) {

//        int leastIndex=findMin(prices);
////        System.out.println(leastIndex);
//        int maxIndex=findMax(prices);
////        System.out.println(maxIndex);
//
//
//
//        if(leastIndex<maxIndex){
//            return prices[maxIndex]-prices[leastIndex];
//
//        }
//        else if(leastIndex>maxIndex){
//           int[] leastPriceArray=new int[leastIndex+1];
//            leastPriceArray=Arrays.copyOfRange(prices,leastIndex,prices.length-1);
////            System.out.println(Arrays.toString(leastPriceArray));
//            maxIndex=findMax(leastPriceArray);
//
//            return leastPriceArray[maxIndex]-leastPriceArray[0];
//        }
//
//        return 0;

        int res = 0;
        if(prices == null || prices.length <=1 )return res;


        int min = prices[0];
        for(int i=1; i< prices.length; i++){
            if(prices[i] > min){
                res = Math.max(res, prices[i] - min);
            }else{
                min = prices[i];
            }
        }

        return res;

    }

//    private static int findMax(int[] prices) {
//        int index=0;
//        int maxPrice=prices[0];
//        for (int i=0;i<prices.length;i++){
//            if (prices[i]>maxPrice){
//                index=i;
//                maxPrice=prices[i];
////                System.out.println(maxPrice);
////
////                System.out.println(index);
//            }
//        }
////        System.out.println(index);
//        return index;
//    }

//    private static int findMin(int[] prices) {
//    int index=0;
//    int minPrice=0;
//    for (int i=0;i<prices.length;i++){
//        if (prices[i]<minPrice){
//            index=i;
//            minPrice=prices[i];
//            System.out.println("we reaching here? :"+minPrice);
//
//        }
//    }
////        System.out.println(minPrice);
//   //     System.out.println(index);
//    return index;
//    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};

        System.out.println(maxProfit(prices));

    }


}
