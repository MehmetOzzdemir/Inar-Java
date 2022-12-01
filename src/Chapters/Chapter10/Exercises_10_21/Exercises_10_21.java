package Chapters.Chapter10.Exercises_10_21;

import java.math.BigInteger;

public class Exercises_10_21 {
    public static void main(String[] args) {
        displayDividable(10);
    }

    public static void displayDividable(int i) {
        BigInteger number =new BigInteger(Long.MAX_VALUE+"").add(BigInteger.ONE);
        int count =0;

        while (count<i){
            if(isDiviable(number)){
                System.out.println(number);
                count++;
            }
            number =number.add(BigInteger.ONE);
        }
    }

    public static boolean isDiviable(BigInteger number) {
        return number.remainder(new BigInteger("5")).equals(BigInteger.ZERO)||
                number.remainder(new BigInteger("6")).equals(BigInteger.ZERO);
    }
}
