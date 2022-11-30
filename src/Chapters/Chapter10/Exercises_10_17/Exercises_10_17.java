package Chapters.Chapter10.Exercises_10_17;

import java.math.BigInteger;

public class Exercises_10_17 {
    public static void main(String[] args) {
        displaySquareNumbers(10);
    }

    private static void displaySquareNumbers(int i) {

        BigInteger number = new BigInteger((long) (Math.sqrt(Long.MAX_VALUE)) + 1 + "");

        System.out.println("LONG.MAX_VALUE is: " + Long.MAX_VALUE);
        for (int j = 0; j < i; j++) {
            System.out.println(number.multiply(number));
            number = number.add(BigInteger.ONE);
        }
    }
}
