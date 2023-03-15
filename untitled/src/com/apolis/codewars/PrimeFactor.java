package com.apolis.codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :
//
//        "(p1**n1)(p2**n2)...(pk**nk)"
//
//        with the p(i) in increasing order and n(i) empty if n(i) is 1.
//
//        Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
public class PrimeFactor {
    private static String factors(int n) {

        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Integer, Integer> map1 = new HashMap<>();
//        int reminder=0;
        int firstPrime = 0;
        while (n != 1) {
            firstPrime = findPrime(n);
            map1.compute(firstPrime, (k, v) -> (v == null) ? 1 : v + 1);
            n /= firstPrime;

        }

        System.out.println(map1);

        Map<Integer,Integer> map= new TreeMap<>(map1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            stringBuilder.append("(");
            if (entry.getValue() > 1) {
                stringBuilder.append(entry.getKey()).append("**").append(entry.getValue());
            } else if (entry.getValue() == 1) {
                stringBuilder.append(entry.getKey());
            }
            stringBuilder.append(")");
        }

        return stringBuilder.toString();
    }

    private static int findPrime(int n) {

        if (n % 2 == 0) {
            return 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {

            if (n % i == 0) {
                return i;
            }
        }
        if (n > 2) {
            return n;
        }
        return 1;

    }

    public static void main(String[] args) {
        int n = 86240;
        System.out.println(factors(n));
    }
}
