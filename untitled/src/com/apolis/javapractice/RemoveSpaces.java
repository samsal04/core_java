package com.apolis.javapractice;

import java.util.Arrays;

public class RemoveSpaces {
    private static boolean isSymbol(char c) {

        if ((c>='a'&&c<='z')||(c>='A'&& c<='Z')){
            return true;
            }
        return false;
    }

    public static void main(String[] args) {
//        String s= "Hi Samar, how are you?";
//        String string= "Hi Samar,!? How are you,! doing?";
        String string1 = "Sa!m,?ar";
//        ra!m,?aS
//        String s1 = s.replace(" ","");
//        System.out.println(s1);


//        System.out.println(s2.reverse().toString());

       char[] charArray=string1.toCharArray();
       System.out.println(charArray);
        int countStart=0;
        int countEnd=charArray.length-1;
        char temp;
        while(countStart<countEnd){

           if (!isSymbol(charArray[countStart])){
               countStart++;
           } else if (!isSymbol(charArray[countEnd])) {
               countEnd--;
           }else{
               temp=charArray[countEnd];
               charArray[countEnd]=charArray[countStart];
               charArray[countStart]=temp;
               countStart++;
               countEnd--;
           }

        }
        System.out.println(String.copyValueOf(charArray));
    }


}
