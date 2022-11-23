package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_19 {

	public static void main(String[] args) {
		int number = 0;
		int number2 = 7;
		for (int row = 1; row <= 128; row+=row) {
			for (int space = 0; space < number2; space++) {
				System.out.print("    ");
			}
			for (int l = 1; l <= row; l += l) {
				System.out.printf("%4d", (l));
			}
			for (int r = number; r > 0; r /= 2) {
				System.out.printf("%4d", (r));
			}
			System.out.println();
			number2--;
			number = row;
		}
	}

}
