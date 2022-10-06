package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_11 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter The Sales Amount : ");
        double salesAmount ;//= input.nextDouble();

        System.out.println("Sales Amount\t\tComission");
        System.out.println("_____________________________");

        for (salesAmount=input.nextDouble();salesAmount<=100000;salesAmount+=5000) {
            System.out.println(salesAmount + "\t\t" + computeCommission(salesAmount));

        }
    }
    public static double computeCommission(double salesAmount){
        double comission=0;
        double balance =0;
        if(salesAmount>=10000){
            balance = (salesAmount-10000);
            comission+=balance*0.12;
        }if (salesAmount>=5000){
            balance = (salesAmount-5000);
            comission+=balance*0.10;
        }if (salesAmount>=0){
            comission+=balance*0.08;
        }
    return salesAmount;
    }
}
