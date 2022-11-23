package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double rightToLeft = 0.0;
		for (int i = 50000; i >= 1; i--) {
			rightToLeft += 1.0 / i;
		}
		System.out.println("Computing from right to left " + rightToLeft);

		double leftToRight = 0.0;
		for (int i = 1; i <= 50000; i++) {
			leftToRight += 1.0 / i;
		}
		System.out.println("Computing from left to right " + leftToRight);
		double difference = rightToLeft - leftToRight;
		System.out.println("Difference is " + difference);

	}
}
