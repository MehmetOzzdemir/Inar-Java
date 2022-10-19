package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_03 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter The Array's Length : ");
        int num =input.nextInt();
        int [] numbers = new int[num];
        System.out.print("The Integers Between 1 and 100 : ");

        for (int i = 0; i <numbers.length ; i++) {
            int randomNumber =(int)(Math.random()*100)+1;
            numbers[i]=randomNumber;
            System.out.printf("%3d",numbers[i]);
        }
    }
}
