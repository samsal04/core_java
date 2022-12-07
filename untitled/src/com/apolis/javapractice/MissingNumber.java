package com.apolis.javapractice;

public class MissingNumber {
    private static int missingNumber(int[] array) {
        int count=array[0];
        for(int i=0;i<array.length;i++){

            if (count==array[i]){
                count++;
            }else if (count!=array[i]){
                return count;
            }

        }
        return count;
    }



    public static void main(String[] args) {
        int[] array={1,2,3,5,6,7};
        System.out.println(missingNumber(array));
    }


}
