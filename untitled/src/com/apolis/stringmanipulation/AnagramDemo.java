package com.apolis.stringmanipulation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

// EAT TEA ATE LATE ATEL GO
// group the above string array
// group 1: EAT TEA ATE
// group 2: LATE ATEL
// group 3: GO

public class AnagramDemo {

    public static HashMap<String, Integer> anagram(String[] s){

        HashMap<String,Integer> anagramMap=new HashMap<>();

        System.out.println(Arrays.stream(s).sorted().collect(Collectors.toList()).toString());
//        for(int i=0;i<s.length;i++){
//            int count=0;
//            while(count<s.length){//
//                Arrays.sort(s[i].toCharArray());
//
//            }
//
//
//
//        }
//        int count=0;
//        String values;
//        for(int i=0;i< s.length;i++){
//            char[] holder= s[i].toCharArray();  //ate
//            Arrays.sort(holder);                //aet
//            for(int j=i+1;j<s.length;j++){
//
//                char[] jHolder=s[j].toCharArray();  // tea
//                Arrays.sort(jHolder);               //aet
//
//                if(holder.equals(jHolder)){
//                    if(anagramMap.containsKey(holder)){
//                        values=anagramMap.get(holder).toString();
//                        values=values+s[j];
//                        anagramMap.put(holder.toString(),Arrays.asList(values));
//                    }
//                    else{
//                        anagramMap.put(jHolder.toString(),Arrays.asList(s[j]));
//                    }
//                }
//
//
//            }
//
//        }
            int count=0;
            for(int i=0;i<s.length;i++){

                char[] c= s[i].toCharArray();
                 Arrays.sort(c);
               String key= String.valueOf(c);
                 if (anagramMap.containsKey(key)){
                     count=anagramMap.get(key);
                     anagramMap.put(key,count+1);
                 }
                 else {
                     anagramMap.put(key,1);
                 }

            }


        return anagramMap;
    }

    public static void main(String[] args) {
        String[] string= {"EAT","TEA","ATE","LATE","ATEL","GO" };

        System.out.println(anagram(string));
    }
}
