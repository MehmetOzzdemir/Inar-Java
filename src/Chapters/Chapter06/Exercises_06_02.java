package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_02 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter an integer to sum the digits of: ");
        long number =input.nextLong();
        System.out.println("the sum of all digits is : "+sumDigits(number));
    }
    public static int sumDigits(long n){
        int temp=(int)Math.abs(n);
        int sum=0;
        while(temp!=0){
            sum+=(temp%10);
            temp=temp/10;
        }
        return sum;
    }
}
