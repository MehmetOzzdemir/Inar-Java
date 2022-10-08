package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_13 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter The Last Number For Testing : ");
        int lastNumber=input.nextInt();
        System.out.println("i\t\t\tm(i)");
        System.out.println("__________________");
        sumSeries(lastNumber);
    }
    public static void sumSeries(int num1){
        double sum=0;
        int count=0;
        for (int i=1;i<=num1;i++){
           sum+=i/(i+1.0);
           count++;
            System.out.print(count+"\t\t\t"+(int)(sum*10000)/10000.+"\n");
        }
    }
}
