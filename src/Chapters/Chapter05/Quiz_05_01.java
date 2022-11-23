package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();
		double sum = 0;
		int cycle = 0;
		int positive = 0;
		int negative = 0;
		while (number != 0) {
			if (number < 0) {
				positive++;
			} else {
				negative++;
			}

			sum += number;
			number = input.nextInt();
			cycle++;
		}
		double average = sum / cycle;
		System.out.println("The number of positives is " + positive);
		System.out.println("The number of positives is " + negative);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);
	}

}
