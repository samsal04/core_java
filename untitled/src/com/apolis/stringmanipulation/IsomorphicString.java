    package com.apolis.stringmanipulation;

    //Given two strings s and t, determine if they are isomorphic.
    //Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    //All occurrences of a character must be replaced with another character while preserving the order of characters.
    //No two characters may map to the same character, but a character may map to itself.
    //
    //
    //        Example 1:
    //        Input: s = "egg", t = "add"
    //        Output: true
    //
    //        Example 2:
    //        Input: s = "foo", t = "bar"
    //        Output: false
    //
    //        Example 3:
    //        Input: s = "paper", t = "title"
    //        Output: true


    import java.util.HashMap;
    import java.util.Map;


    public class IsomorphicString {
        private static boolean isomorphCheck(String s, String t) {


                    Map<Character, Integer> charToIndex_s = new HashMap<>();
                    Map<Character, Integer> charToIndex_t = new HashMap<>();

                    for (Integer i = 0; i < s.length(); ++i)
                        if (charToIndex_s.put(s.charAt(i), i) != charToIndex_t.put(t.charAt(i), i))
                            return false;

                    return true;
                }



    //        if (s.length()!=t.length()){
    //            return false;
    //        }
    //        boolean flag=false;
    //
    //        List<Integer> sList= countList(s);
    //        List<Integer> tList=countList(t);
    //
    //        if (sList.size()!=tList.size()){
    //            return false;
    //        }
    //      for(int i=0;i<countList(s).size();i++){
    //
    //          if(sList.get(i)==tList.get(i)){
    //              flag=true;
    //          }else{
    //              flag=false;
    //          }
    //
    //      }
    //       return flag;
    //    }
    //
    //    private static List<Integer> countList(String s) {
    //
    //        HashMap<Character,Integer> map=new HashMap<>();
    //        int count=0;
    //        for(int i=0;i<s.length();i++){
    //
    //            if (map.containsKey(s.charAt(i))){
    //                count= map.get(s.charAt(i));
    //                map.put(s.charAt(i),count+1);
    //            }
    //            else {
    //                map.put(s.charAt(i),1);
    //            }
    //
    //        }
    //        List<Integer> list= map.values().stream().collect(Collectors.toList());
    //
    //        System.out.println(list);
    //        return list;
    //    }


            public static void main (String[]args){
                String s = "badc";
                String t = "baba";

                System.out.println(isomorphCheck(s, t));
            }


        }
