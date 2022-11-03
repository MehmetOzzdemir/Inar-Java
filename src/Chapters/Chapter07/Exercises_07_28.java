package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_28 {
    public static void main(String[] args) {
        int [] numbers=new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Numbers : ");
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=input.nextInt();
        }
        combination(numbers);

    }
    public static void combination(int []numbers){
        int count =0;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < numbers.length ; j++) {
                System.out.print("("+numbers[i]+","+numbers[j]+") ");
                count++;
                if(count%10==0){
                    System.out.println();
                }
            }
        }
    }
}
