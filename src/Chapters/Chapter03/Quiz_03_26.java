package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = input.nextInt();
		boolean sonuc = true;
		if (number % 5 == 0 && number % 6 == 0) {
			System.out.println("Is " + number + " divisible by 5 and 6 ? " + sonuc);
			System.out.println(number + " divisible both 5 and 6.");

		} else if (number % 5 == 0 || number % 6 == 0) {
			System.out.println("Is " + number + " divisible by 5 or 6, but not both ? " + sonuc);
			System.out.println(number + " divisible by 5 or 6.");
		} else {
			System.out.println("Is " + number + " divisible by 5 and 6 ? " + !sonuc);
			System.out.println(number + " not divisible 5 or 6");

		}
	}
}
