package Chapters.Chapter10.Exercises_10_06;

import Chapters.Chapter10.Exercises_10_05.Exercises_10_05;
import Chapters.Chapter10.Exercises_10_05.StackOfIntegers;

public class Exercises_10_06 {
    public static void main(String[] args) {
        int number = Exercises_10_05.getGromUser();
        StackOfIntegers primeFactors = getPrimeFactors(number);
        display(primeFactors);

    }

    public static void display(StackOfIntegers primeFactors) {
        int count = 0;
        while (!primeFactors.isEmpty()) {
            System.out.printf("%-4d", primeFactors.pop());
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static StackOfIntegers getPrimeFactors(int number) {
        StackOfIntegers primeFactors = new StackOfIntegers();
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                primeFactors.push(i);
            }
        }
        return primeFactors;

    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
