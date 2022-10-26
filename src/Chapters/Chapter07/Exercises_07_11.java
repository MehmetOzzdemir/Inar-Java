package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_11 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Ten Numbers : ");// 1,9 2,5 3,7 2 1 6 3 4 5 2
        double [] arr = new double[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextDouble();
            //arr[i]=(int)(Math.random()*10)/10.;
            System.out.print(arr[i]+" ");
        }
        System.out.printf("\nThe mean is %.2f ",mean(arr));
        System.out.printf("\nThe Standard Deviation is %.5f ",deviation(arr));
    }
    public static double mean(double[] x){
        double mean=0;
        int count =0;
        for (int i = 0; i <x.length ; i++) {
            mean+=x[i];
            count++;
        }
        mean/=count;
        return mean;
    }
    public static double deviation(double[] x){
        double deviation=0;
        int count=0;
        for (int i = 0; i <x.length ; i++) {
            deviation+=Math.pow((x[i]-mean(x)),2);
            count++;
        }
        deviation=Math.sqrt(deviation/(count-1));
        return deviation;
    }
}
