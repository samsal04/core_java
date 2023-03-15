package com.apolis.javapractice;
//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//Note: The function accepts an integer and returns an integer

public class SquareConcat {
    private static int squareDigits(int n) {

       String s=Integer.toString(n);
//       StringBuilder stringBuilder= new StringBuilder();
//       stringBuilder=stringBuilder.reverse();
//       s=stringBuilder.toString();
//
//       System.out.println(String.valueOf(stringBuilder));
        int num=0;
        int result=0;
        String holder="";
       for(int i=s.length()-1;i>=0;i--){

           num=Integer.parseInt(String.valueOf(s.charAt(i)));
//           System.out.println(num);
           result= num*num;
           holder=String.valueOf(result)+holder;
//           System.out.println(result);

       }


//       System.out.println(holder);


        return Integer.parseInt(holder);
//        return Integer.parseInt(String.valueOf(n)
//                .chars()
//                .map(i -> Integer.parseInt(String.valueOf((char) i)))
//                .map(i -> i * i)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining("")));
    }
    public static void main(String[] args) {
        int n=91195;
        System.out.println(squareDigits(n));
    }
}
