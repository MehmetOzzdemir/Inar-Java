package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter An Integer : ");
        int number =input.nextInt();
        reverse(number);
    }
    public static void reverse(int number){
        String reverse="";
        String s1=number+"";
        for (int i=s1.length()-1;i>=0;i--){
            reverse+=s1.charAt(i);
        }
        System.out.println(number+"'s reverse : "+reverse);
    }
}
