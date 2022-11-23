package weeks.weeks_03;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your Salary ? ");
		double salary = input.nextDouble();
		System.out.print("How many years of service working ? ");
		int years = input.nextInt();
		double bonus;
		if (years >= 5) {
			bonus = salary * 0.05;
			System.out.print("!!! Winned Bonus.Your Bonus is " + bonus + " !!!");

		} else {
			System.out.print("Sorry Do Not Have Any Bonus");
		}
	}

}
