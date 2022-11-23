package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double KILOMETERS = 1609;
		System.out.println("\tMiles\t\tKilometers");
		int cycle = 10;
		for (int i = 0; i < cycle; i++) {
			System.out.print("\t" + i);
			double answer = KILOMETERS * i;
			System.out.println("\t\t" + (int) (answer * 10) / 10.0);
		}

	}
}
