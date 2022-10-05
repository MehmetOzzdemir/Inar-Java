package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_06 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number = input.nextInt();
        displayPattern(number);
    }
    public static void displayPattern(int n){
        for(int i=1;i<=n;i++){//Satır Sayısı
            for(int k=(n-i);k>0;k--){//Boşluk Sayısı
                System.out.print("  ");
            }
            for(int j=i;j>0;j--){//Yazdırma
                System.out.print(j+" ");
        }
            System.out.println();
    }
   }
}
