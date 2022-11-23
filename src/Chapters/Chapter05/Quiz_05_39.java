package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_39 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Goal for The Annually Sales Earn : ");
		double salesEarn = input.nextDouble();

		double Salary;
		double commission = 0;
		double salesAmount = 0;

		while (commission < salesEarn) {
			salesAmount += 0.01;
			commission = 0;
			Salary = 0;
			if (salesAmount > 10000) {
				commission += (Salary = salesAmount - 10000) * 0.12;
			}
			if (salesAmount > 5000) {
				commission += (Salary -= Salary - 5000) * 0.10;
			}
			if (salesAmount > 0) {
				commission += Salary * 0.08;
			}
		}
		System.out.print("Minimum sales to earn " + salesEarn + " : $" + (int) (salesAmount * 100) / 100.);

	}

}
