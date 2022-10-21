package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_05 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int []arr =new int [10];
        System.out.print("Enter Ten Numbers : ");
        for (int i = 0; i <arr.length ; i++) {
            arr [i]=input.nextInt();
            System.out.print(arr[i]+" ");
        }
    }
}
