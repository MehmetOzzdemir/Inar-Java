package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the firs 9 Digits of an ISBN as integer : ");
		int a1 = input.nextInt();
		int a2 = input.nextInt();
		int a3 = input.nextInt();
		int a4 = input.nextInt();
		int a5 = input.nextInt();
		int a6 = input.nextInt();
		int a7 = input.nextInt();
		int a8 = input.nextInt();
		int a9 = input.nextInt();
		int IBSN = (a1 * 1) + (a2 * 2) + (a3 * 3) + (a4 * 4) + (a5 * 5) + (a6 * 6) + (a7 * 7) + (a8 * 8) + (a9 * 9);
		int lastDigit = IBSN % 11;
		if (lastDigit != 10) {
			System.out.print("The ISBN-10 NUMBER is "+a1	+ a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + lastDigit);
		}else 
			System.out.print("The ISBN-10 NUMBER is "+a1	+ a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + "X");
	}

}
