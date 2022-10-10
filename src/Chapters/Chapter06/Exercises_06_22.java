package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_22 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter a Number : ");
        long number =input.nextLong();
        System.out.println(number+" is : "+sqrt(number));


    }
    public static double sqrt(long n) {
        long lastGuess = 1;
        long nextGuess = (lastGuess + n / lastGuess) / 2;
        while (nextGuess - lastGuess != 0) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;


        }
        return nextGuess;
    }

}
