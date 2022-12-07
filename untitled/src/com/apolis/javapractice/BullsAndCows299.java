package com.apolis.javapractice;
//You are playing the Bulls and Cows game with your friend.
//You write down a secret number and ask your friend to guess what the number is.
//When your friend makes a guess, you provide a hint with the following info:
//
//The number of "bulls", which are digits in the guess that are in the correct position.
//The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position.
//Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
//
//Given the secret number secret and your friend's guess, return the hint for your friend's guess.
//The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows.
//Note that both secret and guess may contain duplicate digits.
//
//        Example 1:
//        Input: secret = "1807", guess = "7810"
//        Output: "1A3B"
//        Explanation: Bulls are connected with a '|' and cows are underlined:
//        "1807"
//        |
//        "7810"
//
//        Example 2:
//        Input: secret = "1123", guess = "0111"
//        Output: "1A1B"
//        Explanation: Bulls are connected with a '|' and cows are underlined:
//        "1123"        "1123"
//        |      or     |
//        "0111"        "0111"
//        Note that only one of the two unmatched 1s is counted as a cow since the non-bull digits can only be rearranged to allow one 1 to be a bull.

/*  Logic
    1) bulls: if the charAt given index in secret to charAt given index in guess, increment bulls.
    2) cows: use a hashmaps to populate secret and guess. traverse through the guess map and check if the key is present in the secretmap
                i) if yes then add the minimum value out of the secretmap and guessmap in cow.

 */
import java.util.HashMap;

public class BullsAndCows299 {
    private static String getHint(String secret, String guess) {

        int bulls=0;
        int cows=0;

        HashMap<Character,Integer> secretMap= new HashMap<>();
        HashMap<Character,Integer> guessMap= new HashMap<>();

        for(int i=0;i<secret.length();i++){

            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }
            else {
                char a=secret.charAt(i);
                char b=guess.charAt(i);
                if(secretMap.containsKey(a)){

                    secretMap.put(a,secretMap.get(a)+1);
                }
                else {
                    secretMap.put(a,1);
                }
                if(guessMap.containsKey(b)){

                    guessMap.put(b,guessMap.get(b)+1);
                }
                else{
                    guessMap.put(b,1);
                }
            }

        }

        for(Character c:guessMap.keySet()){

            if(secretMap.containsKey(c)){
                cows=cows+Math.min(secretMap.get(c),guessMap.get(c));
            }

        }

        return bulls+"A"+cows+"B";

    }




    public static void main(String[] args) {
        String secret = "1807", guess = "7810";
        System.out.println(getHint(secret, guess));
    }
}
