package com.apolis.javapractice;



public class CodeJava {
    private static int search(int[] array) {
        int count=array[0];

        for (int i=0;i<array.length;i++){
            if(array[i]==count){
                count++;
            }else {
                return count;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] array={1,2,3,5,6,7};
        System.out.println(search(array));


    }


}
