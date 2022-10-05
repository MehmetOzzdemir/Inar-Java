package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_07 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Investment : ₺");
        double investment = input.nextDouble();
        System.out.print("Interest Rate Annually : %");
        double interestRateAnnualy = input.nextDouble();
        double interestRateMonthly = interestRateAnnualy/1200;
        System.out.print("Number of Years : ");
        int years = input.nextInt();
        System.out.println("Years\t\t₺Future Value");
        System.out.println("_________________________");
        System.out.println();
        for(int i=1;i<=years;i++){
        System.out.println(i+"\t\t\t₺"+(int)(futureInvestmentValue(investment,interestRateMonthly,i)*100)/100.);
    }
    }
    public static double futureInvestmentValue(double investmentAmount,double monthlyInterestRate,int years){
        double futureInvestmentValue = investmentAmount*(Math.pow((1+monthlyInterestRate),(years*12)));
        return futureInvestmentValue;
    }

}
