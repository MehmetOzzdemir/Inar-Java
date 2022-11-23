package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_42 {

	public static void main(String[] args) {
		final double COMMISSION_SOUGHT=30000;
		double commission;
		double salesAmount=0;
		do {
			salesAmount += 0.01;
			commission = 0;
			double Salary = 0;
			if (salesAmount > 10000) {
				commission += (Salary = salesAmount - 10000) * 0.12;
			}
			if (salesAmount > 5000) {
				commission += (Salary -= Salary - 5000) * 0.10;
			}
			if (salesAmount > 0) {
				commission += Salary * 0.08;
			}
		} while (commission < COMMISSION_SOUGHT);
		
		System.out.print("Minimum sales to earn " + COMMISSION_SOUGHT + " : $" + (int) (salesAmount * 100) / 100.);

	}

}
