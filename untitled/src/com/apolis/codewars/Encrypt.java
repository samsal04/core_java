package com.apolis.codewars;
//Encrypt this!
//
//        You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:
//
//        Your message is a string containing space separated words.
//        You need to encrypt each word in the message using the following rules:
//        The first letter must be converted to its ASCII code.
//        The second letter must be switched with the last letter
//        Keepin' it simple: There are no special characters in the input.
//
//        Examples:
//
//        Kata.encryptThis("Hello") => "72olle"
//        Kata.encryptThis("good") => "103doo"
//        Kata.encryptThis("hello world") => "104olle 119drlo"

import java.util.Arrays;

public class Encrypt {
    private static String encryptThis(String text) {
        String result="";
        String[] strings= text.split(" ");
//        System.out.println(Arrays.toString(strings));

        for (int i=0;i<strings.length;i++){
                replaceChar(strings[i]);
                replaceToAscii(strings[i]);
        }
//        System.out.println(Arrays.toString(strings));
        if(strings.length>=2){
           result= getString(strings);
        }
        else {
            return strings[0];
        }
        return result;
    }

    private static String getString(String[] strings) {
        StringBuilder stringBuilder= new StringBuilder();
        for (int i=0;i<strings.length;i++){
            stringBuilder.append(strings[i]);
            if(i!=strings.length-1){
                stringBuilder.append(" ");
            }
            else {
                continue;
            }
        }
        return stringBuilder.toString();
    }

    private static String replaceChar(String string) {

        char temp=string.charAt(1);

      string= string.replace(string.charAt(1),string.charAt(string.length()-1));
      string= string.replace(string.charAt(string.length()-1),temp);

      return string;
    }

    private static String replaceToAscii(String string) {

        int ascii= (int)string.charAt(0);
        System.out.println(ascii);
        char asc= (char)ascii;
        string= string.replace(string.charAt(0), asc);
        System.out.println("convert "+string.replace(string.charAt(0), asc));
        return string;
    }

    public static void main(String[] args) {
        String text="hello world";
        System.out.println(encryptThis(text));
    }
//    public class Kata {
//        public static String encryptThis(String message) {
//            String[] words = message.split(" ");
//            StringBuilder result = new StringBuilder();
//
//            for (String word : words) {
//                int asciiCode = (int) word.charAt(0);
//                result.append(asciiCode);
//
//                if (word.length() > 2) {
//                    result.append(word.charAt(word.length()-1));
//                    result.append(word.substring(2, word.length()-1));
//                    result.append(word.charAt(1));
//                } else if (word.length() == 2) {
//                    result.append(word.charAt(1));
//                }
//
//                result.append(" ");
//            }
//
//            return result.toString().trim();
//        }
//    }
//
//System.out.println(encryptThis("Hello")); // "72olle"
//System.out.println(encryptThis("good")); // "103doo"
//System.out.println(encryptThis("hello world")); // "104olle 119drlo"
//return Arrays.stream(text.split(" "))
//        .map(w->w.length()>2?(int)w.charAt(0)+w.substring(w.length()-1)+w.substring(2, w.length()-1)+w.substring(1,2):
//            w.length()>1?(int)w.charAt(0)+w.substring(1):
//            w.length()==1?(int)w.charAt(0)+"":"")
//            .collect(Collectors.joining(" "));

//     return compile(" ").splitAsStream(text)
//                           .map(w -> w.isEmpty() ? "" : (int) w.charAt(0) + (w.length() > 2 ? w.replaceFirst(".(.)(.*)(.)", "$3$2$1") : w.substring(1)))
//            .collect(joining(" "));
}
