package com.apolis.practicecodes;
// Given a set of strings, find the longest common prefix.
//
//         Input: {"geeksforgeeks", "geeks", "geek", "geezer"}
//         Output: "gee"
//
//         Input: {"apple", "ape", "april"}
//         Output: "ap"


    import java.util.Arrays;
    import java.util.List;
    import java.util.stream.Collectors;

    public class LongestPrefix {

        public static String prefix(String[] s){


    //     for(int i=0;i<s.length-1;i++){
    //
    //         while(count<s[i].length()){
    //
    //             if (s[i].charAt(count)==s[i+1].charAt(count)){
    //
    //                 stringBuilder.append(s[i]);
    //                 count++;
    //             }
    //
    //         }
    //
    //     }
    //        List<String> slist= Arrays.stream(s).sorted().collect(Collectors.toList());
    //        int count=0;
    //        StringBuilder stringBuilder= new StringBuilder();
    //
    //        for(int i=0;i<slist.size();i++){
    //
    //            if (slist.get(i).equals(slist.get(i+1))){
    //                stringBuilder.append(slist.get(i));
    //            }else {
    //                while( count<slist.get(i).length()){
    //
    //                    if(slist.get(i).charAt(count)==slist.get(i+1).charAt(count)){
    //                        stringBuilder.append(s[i]);
    //                         count++;
    //                    }
    //
    //                }
    //
    //            }

    //        }

//           if(s.length==0){
//               return "none";
//           }
//           if(s.length==1){
//               return s[1];
//           }
           String prefix= s[0];

            for (int i=0;i<s.length;i++){

                while(s[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.equals("")) return "";
                }

                }

            return prefix;
        }



    public static void main(String[] args) {

        String[] s= {"geeksforgeeks", "geeks", "geek", "geezer"};

        System.out.println(prefix(s));

    }
}
