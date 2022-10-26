package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Ten Numbers : ");
        double [] arr = new double[10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=(int)(Math.random()*100)/10.;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("The minimum number is : " + min(arr));

    }public static double min(double[] array){
        double min =Double.MAX_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
