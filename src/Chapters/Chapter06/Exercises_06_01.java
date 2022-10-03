package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_01 {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("The first 100 pentagonal Number Are : ");
        for (int i=1;i<=100;i++){
            System.out.print(getPentagonNumber(i)+" ");
                if(i%10==0){
                    System.out.println();
                }
        }
    }
    public static int getPentagonNumber(int num1){
        num1=(num1*(3*num1-1)/2);
        return num1;
    }
}
