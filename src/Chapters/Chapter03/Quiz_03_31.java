package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double currency = input.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa:");
		int decision = input.nextInt();

		double dollar;
		double yuan;

		if (decision == 0) {
			System.out.print("Enter Dollar Amount : ");
			dollar = input.nextDouble();
			yuan = (int) (dollar * currency * 100) / 100.0;
			System.out.print(dollar + " is " + yuan);
		} else if (decision == 1) {
			System.out.print("Enter RMB Amount : ");
			yuan = input.nextDouble();
			dollar = (int) (yuan / currency * 100) / 100.0;
			System.out.print(yuan + " is " + dollar);
		} else {
			System.out.print("Incorrect input");
		}
	}

}
