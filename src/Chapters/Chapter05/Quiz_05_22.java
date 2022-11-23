package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\t\t\t Monster Bank Percentage of Loan");
		System.out.println("\t\t\t__________________________________");
		System.out.print("Loan Amount : ");
		int loan = input.nextInt();
		System.out.print("Number of Years : ");
		int year = input.nextInt();
		System.out.print("Annual Interest Rate : ");
		double AnnualInterest = input.nextDouble();
		System.out.println("\t\t\t__________________________________");
		double monthlyInterestRate = AnnualInterest / 1200;
		double monthlyPayment = loan * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
		System.out.println("\nMonthly Payment : "+(int)(monthlyPayment*100)/100.0);
		System.out.println("Total Payment : "+(int)(monthlyPayment*year*12*100)/100.0);
		System.out.println("\t\t\t__________________________________");
		double interest;
		double balance = loan;
		double principal;
		System.out.println("\nPayment# \t\t Interest \t\t Princial \t\t Balance");
		for (int month = 1; month <= 12 * year; month++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			 System.out.println(month + "\t\t\t" + (int)(interest*100)/100.0+ "\t\t\t" + (int)(principal*100)/100.0 + "\t\t\t" + (int)(balance*100)/100.0);

		}
	}

}
