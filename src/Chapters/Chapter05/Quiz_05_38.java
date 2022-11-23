package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Decimal Integer : ");
		int decimal = input.nextInt();

		String octal = "";
		for (int i = decimal; i > 0; i /= 8) {
			octal = (i % 8) + octal;
		}
		System.out.println(decimal + " Decimal : " + octal + " Binary");
	}

}
