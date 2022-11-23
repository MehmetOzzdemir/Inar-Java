package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double e = 1.0;
		double faktoriyel = 1.0;
		System.out.print("Enter The Last Value : ");
		int last = input.nextInt();
		for (int i = 1; i <= last; i++) {
			faktoriyel *= i;
			e += (1 / faktoriyel);
			for (int j = 1; j <= i / 10000; j++) {
				if (i == 10000 * j) {
					System.out.println("e value for " + i + " : " + e);
				}
			}
		}
		System.out.println("e value for  "+last+" : " + e);
	}

}