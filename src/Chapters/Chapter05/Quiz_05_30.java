package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_30 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter Monthly Saving Amount : ");
		double saving=input.nextDouble();
		System.out.print("Enter Annually Interest Rate (e.g. 5) : ");
		double annuallyInterestRate = input.nextDouble();
		System.out.print("Enter Saving Time Number of Month : ");
		int month = input.nextInt();
		double monthlyInterestRate = annuallyInterestRate/1200;
		monthlyInterestRate=(int)(monthlyInterestRate*100000)/100000.;
		double totalSaving=0;
		for(int i=0;i<month;i++) {
			
			totalSaving=(totalSaving+saving)*(1+monthlyInterestRate);
			System.out.printf(i+1+" . Month Total Saving Amount : "+ "$%.3f \n",totalSaving);
		}
		System.out.printf("Amount in savings account after " +month + " months: $%.3f",totalSaving);
	}

}
