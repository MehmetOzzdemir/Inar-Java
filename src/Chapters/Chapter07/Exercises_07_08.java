package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Ten Doubles : ");
        double []arr =new double[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextDouble();
        }
        System.out.print("Average : " + average(arr));
    }
    public static int average(int[] array){
        int average=0;
        for (int i = 0; i <array.length ; i++) {
            average+=array[i];
        }
        average/= array.length;
        return average;
    }
    public static double average(double[] array){
        double average=0;
        for (int i = 0; i <array.length ; i++) {
            average+=array[i];
        }
        average/= array.length;
        return average;
    }

}
