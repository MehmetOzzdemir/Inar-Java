package volkanhocaexercises;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Your Lottery Numbers : ");
		int numbers = input.nextInt();
		int number1 = numbers / 10;
		int number2 = numbers % 10;

		int lottery = (int) (Math.random() * 90) + 10;

		System.out.println("Win Numbers : " + lottery);

		int lotteryNumber1 = lottery / 10;
		int lotteryNumber2 = lottery % 10;

		if (lottery == numbers) {
			System.out.println("!!! WİN 10.000 TL !!!");
		} else if (lotteryNumber1 == number2 && lotteryNumber2 == number1) {
			System.out.println("!!! WİN 3.000 TL !!!");
		} else if (lotteryNumber1 == number2 || lotteryNumber1 == number1 || lotteryNumber2 == number1
				|| lotteryNumber2 == number2) {
			System.out.println("!!! WİN 1.000 TL !!!");

		} else {
			System.out.println("!!! LOST !!!");
		}
	}

}
