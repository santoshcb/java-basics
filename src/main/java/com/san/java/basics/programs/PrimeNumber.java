package com.san.java.basics.programs;

public class PrimeNumber {

    public static void main(String[] args) {

        String primeNumbers = "";
        for (int i = 0; i < 100; i++) {
            int count = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers between 1 to 100 are:");
        System.out.println("Primes:" + primeNumbers);
    }


}
