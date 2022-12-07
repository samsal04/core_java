package com.apolis.javapractice;

public class SmallestAndLargest {
//    private static int large(int[] array) {
//       int largest=array[0];
//
//        for(int i=0;i<array.length;i++){
//            if (array[i]>largest){
//                largest=array[i];
//            }
//        }
//        return largest;
//    }

    private static void large(int[] array) {
        int smallest=array[0];
        int largest=array[0];

        for(int i=0;i<array.length;i++){
            if (array[i]>largest){
                largest=array[i];
            }
            if (array[i]<smallest){
                smallest=array[i];
            }
        }


       System.out.println(smallest+" "+ largest);
    }
    public static void main(String[] args) {
        int[] array={1,5,2,7,3,9};

//        System.out.println(small(array));
      large(array);
    }


}
