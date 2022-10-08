package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_14 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter The Last Number : ");
        double end=input.nextDouble();
        System.out.println("i\t\t\tm(i)");
        System.out.println("-----------------------");
        for(double i = 1;i<=end;i+=100){
            System.out.print(i+"\t\t\t");
            System.out.println(sumSeriesWithPI(i));
        }

    }
    public static double sumSeriesWithPI(double answer){
        double pi =0;
        for(int i=1;i<=answer;i++){
            pi +=Math.pow(-1,i+1)/(2*i-1);
        }
        pi*=4;
        return (int)(pi*10000)/10000.0;
    }
}
