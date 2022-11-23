package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_33 {

	public static void main(String[] args) {
		int divisors;
		for (int perfectNumber = 1; perfectNumber < 10000; perfectNumber++) {
			divisors = 0;
			for (int i = 1; i < perfectNumber; i++) {
				if (perfectNumber % i == 0) {
					divisors += i;
				}
			}
			if (perfectNumber == divisors) {
				System.out.println(divisors);
			}
		}

	}
}