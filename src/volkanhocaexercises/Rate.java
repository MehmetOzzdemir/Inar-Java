package volkanhocaexercises;

import java.util.Scanner;

public class Rate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Annual Interest Rate (8,5 etc.) : ");
		
		double annuallyInterestRate = input.nextDouble();
		
		System.out.print("Number of Years : ");
		
		int numberOfYears = input.nextInt();
		
		System.out.print("Loan Amount : ");
		
		double loanAmount = input.nextDouble();
		
		double mountlyInterestRate = annuallyInterestRate/1200;
		
		double mountlyLoan = (loanAmount*mountlyInterestRate)/(1-(1/Math.pow((1+mountlyInterestRate),numberOfYears*12)));
		
		double totalLoan = mountlyLoan*12*numberOfYears;
		
		System.out.println("Mountly Loan Amount : "+ (int)(mountlyLoan *100 )/100.0);
		System.out.print("Annualy Loan Amount : "+ (int)(totalLoan*100)/100.0);

	}

}
