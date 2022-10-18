package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_02 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter ten Integers: ");

        int[] ten = new int[10];


        for (int i = 0; i < ten.length; i++){
            int num =(int)(Math.random()*100)+1;
            ten[i] = num;
            System.out.print(ten[i]+" ");
        }
        System.out.print("\nThe Reverse of Numbers :");
        for (int i = ten.length - 1; i >= 0; i--) {
            System.out.print(+ten[i] + " ");
    }
    }
}
