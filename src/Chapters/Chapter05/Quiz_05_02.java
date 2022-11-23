package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int correct = 0;
		int incorrect = 0;
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			int number1 = (int) (Math.random() * 15);
			int number2 = (int) (Math.random() * 15);
			System.out.print("What is " + number1 + " + " + number2 + " ? ");
			int solution = input.nextInt();
			if (solution == number1 + number2) {
				correct++;
			} else {
				incorrect++;
			}
		}
		System.out.println(correct + " True Solution");
		System.out.println(incorrect + " True Solution");

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Test Time is " + testTime + "second");
	}

}
