package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_13 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int [] arr = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("Number generated : "+getRandom(arr));


    }
    public static int getRandom(int... numbers){
        int random =(int)(Math.random()*54+1);
        for (int i = 0; i <numbers.length ; i++) {
            if(random==numbers[i]){
                random= (int)(Math.random()*54+1);
                i=-1;

            }
        }
        return random;
    }
}
