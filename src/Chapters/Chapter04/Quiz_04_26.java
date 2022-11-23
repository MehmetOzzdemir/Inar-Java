package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount, for example 11,56: ");
		String amount = input.nextLine();

		String numberOfOneLiras = amount.substring(0, amount.indexOf(','));

		int Liras = Integer.parseInt(amount.substring(amount.indexOf(',') + 1));

		int numberOfFiftyKurus = Liras / 50;
		Liras %= 50;

		int numberOfTwentyFiveKurus = Liras / 25;
		Liras %= 25;

		int numberOfTenKurus = Liras / 10;
		Liras %= 10;

		int numberOfFiveKurus = Liras / 5;
		Liras %= 5;

		System.out.println("Your amount " + amount + " consists of\n " + numberOfOneLiras + " Liras\n "
				+ numberOfFiftyKurus + " 50 Kurus\n " + numberOfTwentyFiveKurus + " 25 Kurus\n " + numberOfTenKurus
				+ " 10 Kurus\n " + numberOfFiveKurus + " 5 Kurus\n " + Liras + " 1 Kurus\n ");
	}

}
