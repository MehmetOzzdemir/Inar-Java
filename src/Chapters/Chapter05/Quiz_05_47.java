package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string : ");
		String ISBN = input.next();
		int lastDigit = 0;
		int lastDigit2 = 0;
		int ISBN13;
		if (ISBN.length() == 12) {
			for (int i = 0; i < ISBN.length(); i += 2) {
				lastDigit += (ISBN.charAt(i) - '0');
			}
			for (int j = 1; j < ISBN.length(); j += 2) {
				lastDigit2 += (3 * (ISBN.charAt(j) - '0'));
			}
			ISBN13 = 10 - ((lastDigit + lastDigit2) % 10);
			if (ISBN13 != 10) {
				System.out.print("The ISBN-13 number is " + ISBN + ISBN13);
			} else {
				System.out.print("The ISBN-13 number is " + ISBN + "0");
			}
		} else {
			System.out.println(ISBN + " is an invalid input");
		}
	}
}
