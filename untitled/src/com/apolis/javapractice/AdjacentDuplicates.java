package com.apolis.javapractice;

// Given a list of integers like [1, 1, 2, 2, 2, 2, 1],
// eliminate those values that have at least 3 adjacent
// duplicates and return the new list.


import java.util.ArrayList;
import java.util.List;

public class AdjacentDuplicates {

    public static int[] list(int[] array){
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 2 && array[i] == array[i + 1] && array[i] == array[i + 2]) {
                while (i < array.length - 1 && array[i] == array[i + 1]) {
                    i++;
                }
            } else {
                newArray[j++] = array[i];
            }
        }


        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = newArray[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] array= {1, 1, 2, 2, 2, 2, 1};

        for (int i=0;i<list(array).length;i++) {
            System.out.print(list(array)[i]);
        }
    }
}
