package com.apolis.practicecodes;

public class ReverseWithoutSpecialCharacter {

    private static boolean isAlphabate(char c) {
        if ((c>='a'&& c<='z') ||(c>='A'&& c<='Z')){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="is, this a ?.special$$ character?!@";

        char[] charArray= s.toCharArray();
        int startElement= 0;
        int lastElement= charArray.length-1;
        char temp;

        while(startElement!=lastElement){

            if (!isAlphabate(charArray[startElement])){
                startElement++;
            }
            else if (!isAlphabate(charArray[lastElement])){
                lastElement--;
            }
            else {
                temp=charArray[lastElement];
                charArray[lastElement]=charArray[startElement];
                charArray[startElement]=temp;
                startElement++;
                lastElement--;
            }

        }

        System.out.println(String.copyValueOf(charArray));

    }


}
