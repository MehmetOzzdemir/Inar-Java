package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PoundCurrency = 2.2;
		System.out.println("\tKilograms\tPounds");
		int cycle = 200;
		for (int i = 1; i < cycle; i = i + 2) {
			System.out.print("\t" + i);
			double pound = PoundCurrency * i;
			System.out.println("\t\t" + (int) (pound * 10) / 10.0);
		}
	}

}
