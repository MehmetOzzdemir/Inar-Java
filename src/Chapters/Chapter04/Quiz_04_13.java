package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A Letter : ");
		String s1 = input.next().toLowerCase();
		char ch = s1.charAt(0);
		if (Character.isLetter(ch)) {
			if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'ü' || ch == 'o' || ch == 'ö' || ch == 'i' || ch == 'ı') {
				System.out.print(ch + " is a vowel");
			} else {
				System.out.print(ch + " is a consonant");
			}

		} else {
			System.out.print(ch + " is an invalid input");
		}
	}

}
