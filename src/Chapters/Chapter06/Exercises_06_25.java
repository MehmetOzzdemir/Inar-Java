package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_25 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter The  MilliSecond : ");
        long milliSecond=input.nextLong();
        System.out.println(convertMillis(milliSecond));
    }
    public static String convertMillis(long millis){
        long second=millis/1000;
        long minutes=0;
        long hours=0;
        if (second>60){
            minutes=second/60;
            second%=60;
            if(minutes>60){
                hours=minutes/60;
                minutes%=60;
            }
        }
        String s1=Long.toString(hours);
        String s2=Long.toString(minutes);
        String s3=Long.toString(second);

        return (s1+":"+":"+ s2 +":"+s3);
    }
}
