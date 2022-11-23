package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Initial Deposit Amount : ");
		double deposit = input.nextDouble();
		System.out.print("Enter annual percentage yield : ");
		double annualPercentage = input.nextDouble();
		System.out.print("Enter maturity period (number of months) : ");
		int month = input.nextInt();
		double worth=0;
		System.out.println("Month \t  CD Value");
		System.out.println("___________________");
		System.out.println();
		for (int i=0;i<month;i++) {
			worth=deposit+(deposit*annualPercentage/1200);
			System.out.println(i+1+" \t $ "+(int)(worth*100)/100.);
			deposit+=deposit*annualPercentage/1200;
		}
		//System.out.println(worth);
	}

}
