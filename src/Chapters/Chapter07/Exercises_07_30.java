package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_30 {
    public static void main(String[] args) {
        /*
        (Pattern recognition: consecutive four equal numbers) Write the following
        method that tests whether the array has four consecutive numbers with the same
        value.public static boolean isConsecutiveFour(int[] values)
        Write a test program that prompts the user to enter a series of integers and
        displays if the series contains four consecutive numbers with the same value. Your
        program should first prompt the user to enter the input size—i.e., the number of
        values in the series. Here are sample runs:
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values : ");
        int number = input.nextInt();
        int[] values = new int[number];

        System.out.print("Enter The Values : ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        System.out.print("The List Has" + (isConsecutiveFour(values) ? " " : " no") + "Consectuve Values");


    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == values[i + 1]) {
                count++;
            }
            if (count >= 4) {
                return true;
            }
            if (values[i] != values[i + 1]) {
                count = 1;
            }
        }
        return false;
    }
}
