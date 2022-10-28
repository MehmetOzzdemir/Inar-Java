package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Ten Numbers: ");//1 2 3 4 5 6 7 8 9 10
        int [] arr= new int[10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=input.nextInt();
        }
        System.out.print("Your Array's Reverse : ");
        int [] reverseArr = reverse(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(reverseArr[i]+" ");
        }
    }
    public static int [] reverse(int [] arr){
        int count=arr.length-1;
        int [] reverse = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            reverse[count]=arr[i];
            count--;
        }
        return reverse;
    }
}
