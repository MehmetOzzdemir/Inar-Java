package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_05 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int []arr =new int [10];

        int num;
        int count=0;

        System.out.print("Enter Ten Numbers : ");
        for (int i = 0; i <arr.length ; i++) {
            num=input.nextInt();
            if(isDistinct(arr,num)){
                arr[count]=num;
                count++;
            }
        }
        System.out.println("The Number of Distinct Number is "+count);
        System.out.print("The Distinct Number are");
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>0){
                System.out.print(" "+arr[i]);
            }
        }

    }
    public static boolean isDistinct (int [] arr1, int num){
        for (int i = 0; i < arr1.length ; i++) {
            if(num == arr1[i]){
                return false;
            }
        }return true;
    }
}
