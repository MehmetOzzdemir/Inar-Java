package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PoundCurrency = 2.20;
		System.out.println("\t________________________                ___________________________");
		System.out.println("\t|Kilograms\t|Pounds|\t\t|Pounds|\t|Kilograms|");
		System.out.println("\t________________________                ___________________________");
		System.out.println();
		int cycle = 200;
		double pound2=15;
		for (int i = 1; i < cycle; i = i + 2) {
			System.out.print("\t|" + i);
			double pound = PoundCurrency * i;
			System.out.print("\t\t|" + (int) (pound * 100) / 100.0);
			pound2+=5;
			double kilograms =pound2/PoundCurrency;	
				System.out.println("\t\t\t|"+pound2+"\t\t|" + (int) (kilograms * 100) / 100.0);
				
			
		}

	}
}