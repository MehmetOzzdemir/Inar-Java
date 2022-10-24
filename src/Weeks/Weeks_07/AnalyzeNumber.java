package Weeks.Weeks_07;

import java.util.Scanner;

public class AnalyzeNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("How Many Number for Average ? ");
        
        int number =input.nextInt();

        double sum =0;
        double [] arr=new double [number];
        System.out.print("Numbers : ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextDouble();
            sum+=arr[i];
            
        }
        double average = (sum/number)*1.0;
        System.out.println("Average : "+ average);

        int count =0;
        System.out.print("Highest Numbers : ");
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>average){
                System.out.printf("%.1f ",arr[i]);
                count++;
            }
        }
        System.out.println();

        System.out.print("Highest Average Numbers : "+count);
    }
}
