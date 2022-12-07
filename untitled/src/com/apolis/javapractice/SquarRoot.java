package com.apolis.javapractice;
//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.
// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
//        Example 1:
//
//        Input: x = 4
//        Output: 2
//        Explanation: The square root of 4 is 2, so we return 2.
//
//        Example 2:
//
//        Input: x = 8
//        Output: 2
//        Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
//
public class SquarRoot {
    private static int root(int x){                         // 8    2X2=4 <8 => root= count   -------  3X3=9 >8
//        int root=0;
//        int count=0;
//
//        if (x==1){
//            return 1;
//
//        }
//
//        while(count<=x/2 || count*count>=x){
//
//            if (count*count<=x){
//                root=count;
//            }
//           count++;
//
//        }
//
//
//        return root;
        int end = x / 2;

        int start = 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if ((long)mid*mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;

    }
    public static void main(String[] args) {
        int x=8;
        System.out.println(root(x));
    }
}
