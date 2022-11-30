package Chapters.Chapter10.Exercises_10_16;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercises_10_16 {
    public static void main(String[] args) {
        display50DecimalDigits(10);
    }
    public static void display50DecimalDigits(int num){
        int count =0;
        BigInteger number = new BigInteger("100000000000000000000000000000000000000000000000000");
        while (count<num){
            if (number.remainder(new BigInteger ("2")).equals(BigInteger.ZERO) ||
                    number.remainder(new BigInteger("3")).equals(BigInteger.ZERO)){
                System.out.println(number);
                count++;
            }
            number=number.add(BigInteger.ONE);
        }
    }
}
