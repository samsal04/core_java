package com.apolis.enjoyalgorithm;

import java.util.Arrays;

//Given an array of n integers where n>1, write a program to return an array product[] such that product[i] is
//equal to the product of all the elements of array except array[i].class
//
//Example:
//
//input:array[]={2,1,3,4}   output: product[]={12,24,8,6}
//
//input: array[]={1,0,4,3,5} output: product[]={0,60,0,0,0}
public class ProductExceptSelf {
    private static int[] product(int[] array) {

        int[] product= new int[array.length];

        int productOfOriginal= Arrays.stream(array).reduce(1,(a,b)->a*b);

        for (int i=0;i<array.length;i++){

            product[i]=productOfOriginal/array[i];

        }

        return product;
    }
    public static void main(String[] args) {
        int[] array= {2,1,3,4};
        System.out.println(Arrays.toString(product(array)));
    }

}
