package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Investment : ");
		double investment = input.nextDouble();
		System.out.print("Interest Rate Annually : ");
		double interestRateAnnualy = input.nextDouble();
		double interestRateMonthly = interestRateAnnualy/1200;
		System.out.print("Number of Years : ");
		double years = input.nextDouble();
		
		double futureInvestmentValue = investment*(Math.pow((1+interestRateMonthly),(years*12)));
		
		System.out.println("Accumulated value is "+(int)(futureInvestmentValue*100)/100.0);
	}

}
