package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_37 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number =input.nextInt();
        System.out.print("Enter The Number of Width : ");
        int width = input.nextInt();
        System.out.print(format(number,width));
    }public static String format(int number, int width){
        String num="";
        int count=0;
        int num2=number;
        while (num2>0){
            num2/=10;
            count++;
        }
        for (int i = 0; i <width-count; i++) {
            num+=0;
        }
        num=num+number;
        return num;
    }
}
