package com.apolis.javapractice;
//Given a string, find the count of distinct subsequences of it.
//
//        Examples:
//
//        Input  : str = "gfg"
//        Output : 7
//        The seven distinct subsequences are "", "g", "f",
//        "gf", "fg", "gg" and "gfg"
//
//        Input  : str = "ggg"
//        Output : 4
//        The four distinct subsequences are "", "g", "gg"
//        and "ggg"

public class DistinctSubsequence {
    private static int subsequence(String s) {

      int num=s.length();
      int[] permutation= new int[num+1];
      permutation[0]=1;

      int[] last= new int[256];

      for(int i=0;i<256;i++){
          last[i]=-1;
//          System.out.println(last[i]);
      }

      for(int i=1;i<=num;i++){
          permutation[i]= 2*permutation[i-1];
          if(last[s.charAt(i-1)]!=-1){
             permutation[i]=permutation[i]-permutation[last[s.charAt(i-1)]];
          }
          last[s.charAt(i-1)]=(i-1);

//          System.out.println(permutation[i]);
      }

      return permutation[num];
    }
    public static void main(String[] args) {
        String s="ggg";

        System.out.println(subsequence(s));

    }


}
