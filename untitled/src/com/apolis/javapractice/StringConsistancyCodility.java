package com.apolis.javapractice;
import java.util.HashSet;
import java.util.Set;
import static java.util.Objects.isNull;

/**
 * You are given a string consisting of lowercase letters of the English alphabet.
 * You must split this string into a minimal number of substrings in such a way
 * that no letter occurs more than once in each substring.
 *
 * For example, here are some correct splits of the string
 * 'abacdec': ('a', 'bac', 'dec'), ('a', 'bacd', 'ec') and ('ab', 'ac', 'dec').
 *
 * Write a function:
 * that given a string S of length N,
 * returns the minimum number of substrings into which the string has to be split.
 *
 * Examples:
 * 1. Given World. your function should return 1.
 * There is no need to split the string into substrings as afl letters occur just once.
 *
 * 2. Given 'diddd, your function should return 4.
 * The result can be achieved by splitting the string into four substrings (d, 'd, d, d).
 *
 * 3. Given 'cycle', your function should return 2
 * The result can be achieved by spliting the string into two substrings
 * ('cy, 'cle') or ('c', 'ycle')
 *
 * 4. Given 'abba', your function should return 2.
 * The result can be achieved by splitting the string into two substrings
 * ('ab','ba')
 */
public class StringConsistancyCodility {
    public static void main(String...args){
        //System.out.println(solution("World")); //1
        //System.out.println(solution("diddd")); //4
        //System.out.println(solution("cycle")); //2
        System.out.println(solution("hhhh"));  //2
        System.out.println(solution(null)); //2
    }

    public static int solution(String request) {
        int remaining = 0;
        int counter = 0;
        Set<Character> setString = new HashSet<>();

        if(isNull(request))
            return 1;

        while (remaining < request.length()) {
            if (setString.contains(request.charAt(remaining))) {
                counter++;
                setString.clear();
            }
            setString.add(request.charAt(remaining));
            remaining++;
        }
        return counter + 1;
    }


}
