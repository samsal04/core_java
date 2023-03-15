package com.apolis.javapractice;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static List<Integer> findPrimeFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        while (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }

        System.out.println(Math.sqrt(number));
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        if (number > 2) {
            factors.add(number);
        }
        return factors;
    }

    public static void main(String[] args) {
        int number = 86240;
        List<Integer> primeFactors = findPrimeFactors(number);
        System.out.println("The prime factors of " + number + " are: " + primeFactors);
    }
}
