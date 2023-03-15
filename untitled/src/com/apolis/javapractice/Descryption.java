package com.apolis.javapractice;

import java.util.Arrays;

public class Descryption {
    private static String decryptMessage(String encryptedMessage) {

        String[] message= encryptedMessage.split(" ");
        StringBuilder stringBuilder= new StringBuilder();

//        System.out.println(Arrays.toString(message));

        for(int i= message.length-1; i>=0; i++ ){

            message[i].matches("(.*)10(.*)");
         if(checkNum(message[i])){

         }
         else{
             stringBuilder.append(message[i]);
         }

        }


        return String.valueOf(stringBuilder);

    }

    private static boolean checkNum(String s) {

//        for (int i=0;i<s.length();i++){
//            if(s.charAt(i)==){
//
//            }
//        }

        return true;
    }

    public static void main(String[] args) {
        String encryptedMessage="world hel2o";
        System.out.println(decryptMessage(encryptedMessage));
    }
}
