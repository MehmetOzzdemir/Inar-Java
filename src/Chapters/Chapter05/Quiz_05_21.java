package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_21 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Loan Amount : ");
		int loan=input.nextInt();
		System.out.print("Number of Years : ");
		int years=input.nextInt();
		
		System.out.println("Interest Rate \t Monthly Payment \t Total Payment");
		for(double interestRate=5;interestRate<=8;interestRate+=0.125) {
			double monthlyInterestRate = interestRate / 1200;
			System.out.print(interestRate+"% \t\t ");
			
			double monthlyPayment = loan * monthlyInterestRate / (1	- 1 / Math.pow(1 + monthlyInterestRate,years * 12));
			System.out.print((int)(monthlyPayment*100)/100.0+" \t\t ");
			double totalPayment = monthlyPayment * years * 12;
			System.out.println((int)(totalPayment*100)/100.0);
		}
	}

}
