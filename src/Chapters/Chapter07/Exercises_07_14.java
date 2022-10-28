package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Five Numbers : ");//5 10 15 20 25
        int [] numbers = new int[5];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=input.nextInt();
            System.out.print(numbers[i]+" ");
        }

        System.out.println("'s GCD :"+gcd(numbers));

    }
    public static int gcd(int... numbers){
        int gcd=1;
        int min=min(numbers);
        int count=0;
        for (int i = 2; i <= min ; i++) {
            for (int j = 0; j <= (numbers.length-1); j++) {
                if(numbers[j]%i==0){
                    count++;
                    if(count==(numbers.length)){
                        gcd = i;
                    }
                }else{
                    count=0;
                }
            }
        }
        return gcd;
    }

    private static int min(int[] numbers) {
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        return min;
    }
}
