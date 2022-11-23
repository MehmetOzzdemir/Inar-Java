package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Pattern (A/B/C/D) : ");
		// String pattern = input.nextLine();
		// pattern.toLowerCase();
		int pattern = input.nextInt();
		System.out.print("Enter The Line : ");
		int line = input.nextInt();
		if (pattern == 1) {
			System.out.println("---------------");
			System.out.println("Pattern A ");
			for (int row = 1; row <= line; row++) {
				for (int numbers1 = 1; numbers1 <= row; numbers1++) {
					System.out.print(numbers1);
				}
				System.out.println();
			}
		}
		if (pattern == 2) {
			System.out.println("---------------");
			System.out.println("Pattern B ");
			for (int row = line; row >= 1; row--) {
				for (int numbers1 = 1; numbers1 <= row; numbers1++) {
					System.out.print(numbers1);
				}
				System.out.println();
			}
		}

		if (pattern == 3) {
			System.out.println("---------------");
			System.out.println("Pattern C ");
			for (int row = 1; row <= line; row++) {
				for (int space = (line - row); space > 0; space--) {
					System.out.print(" ");
				}
				for (int number1 = 1; number1 <= row; number1++) {
					System.out.print(number1);
				}
				System.out.println();
			}
		}
		if (pattern == 4) {
			System.out.println("---------------");
			System.out.println("Pattern D ");
			for (int row = line; row > 0; row--) {
				for (int space = (line - row); space > 0; space--) {
					System.out.print(" ");
				}
				for (int number1 = 1; number1 <= row; number1++) {
					System.out.print(number1);
				}
				System.out.println();
			}
		}
	}
}
