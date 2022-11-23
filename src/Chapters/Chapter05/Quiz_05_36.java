package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String isbn = input.nextLine();
		int d10 = 0;
		System.out.print("ISBN Number : ");
		for (int i = 0; i < 9; i++) {
			d10 += (isbn.charAt(i) * (i + 1));
			System.out.print(isbn.charAt(i)+" ");

		}
		d10 %= 11;
		if (d10 != 10) {
			System.out.print(d10);
		} else {
			System.out.println("X");
		}
	}

}
