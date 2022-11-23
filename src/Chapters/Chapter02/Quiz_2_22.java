package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount as integer, for example 1156 for 11.56: ");
		int amount = input.nextInt();

		int remainingAmount = amount;

		int numberOf1Liras = remainingAmount / 100;
		remainingAmount %= 100;

		int numberOf50Kurus = remainingAmount / 50;
		remainingAmount %= 50;
		
		int numberOf25Kurus = remainingAmount / 25;
		remainingAmount %= 25;

		int numberOf10Kurus = remainingAmount / 10;
		remainingAmount %= 10;

		int numberOf5Kurus= remainingAmount / 5;
		remainingAmount %= 5;

		int numberOf1Kurus = remainingAmount;

		System.out.println("Your amount " + amount / 100.0+" TL" );
		System.out.println(" " + numberOf1Liras + " Liras ");
		System.out.println(" " + numberOf50Kurus + " 50 Kurus ");
		System.out.println(" " + numberOf25Kurus + " 25 Kurus");
		System.out.println(" " + numberOf10Kurus + " 10 Kurus ");
		System.out.println(" " + numberOf1Kurus + " 1 Kurus ");
	}

}
