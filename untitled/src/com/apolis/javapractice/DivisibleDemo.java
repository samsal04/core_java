package com.apolis.javapractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//2,5,7,99,10,25,30
//divisible by 5
public class DivisibleDemo {
    public static void main(String[] args) {

        int[] arr= {1,2,2,3,4,7,8,33,44,55,1,1,44,66,77};

//        for (int i=0;i<arr.length;i++){//
//            if(arr[i]%5==0){
//                System.out.println(arr[i]);
//            }
//        }

//        int temp=0;
//        for(int i=0;i<arr.length-1;i++){
//
//            if (arr[i]>arr[i+1]){
//
//                temp= arr[i+1];
//                arr[i+1]=arr[i];
//                arr[i]=temp;
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//                System.out.println(arr[i]);
//        }
//        int target =9;
//        for (int i=0;i<arr.length-1;i++){
//
//            for (int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.println(arr[i]+" "+arr[j]);
//                }
//            }
//        }


        HashMap<Integer,Integer> hashMap= new HashMap<>();
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                count=hashMap.get(arr[i]);
                hashMap.put(arr[i],count+1);
            }
            else {
                hashMap.put(arr[i],1);
            }
        }
//        System.out.println(hashMap);
//        Map<Integer, String> collect = hashMap.entrySet().stream()
//                .filter(x -> x.getKey() == 2)
//                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

//        int finalCount = count;
//        System.out.println(Arrays.asList(hashMap)
//                .stream()
//                .filter(s->s.containsValue(finalCount >1)).collect(Collectors.toList()).toString());

        System.out.println( hashMap.entrySet()
                .stream()
                .filter(s->s.getValue()>1)
                .collect(Collectors.toMap(s->s.getKey(),s->s.getValue()))
                .toString());


        }



    }

