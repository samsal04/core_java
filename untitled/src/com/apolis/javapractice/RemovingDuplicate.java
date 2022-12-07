package com.apolis.javapractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicate {
    private static int[] duplicates(int[] array) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int count=0;
        int[] array1={1,2};
        for (int i=0;i<array.length;i++){

            if (map.containsKey(array[i])){
                count=map.get(array[i]);
                map.put(array[i],count+1);
            }else {
                map.put(array[i],1);
            }
        }

//        System.out.println(map);
        List<Integer> list1=map.keySet().stream().collect(Collectors.toList());
       array1= list1.stream().mapToInt(Integer::intValue).toArray();

        return array1;



    }
    public static void main(String[] args) {
        int[] array={1,1,2,2,2,3,4,5};
        System.out.println(Arrays.toString(duplicates(array)));
    }


}
