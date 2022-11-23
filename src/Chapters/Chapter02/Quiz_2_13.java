package chapters.chapter_02;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz_2_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount : ");
		double saving = input.nextDouble();
		System.out.print("Enter Inretest Rate in Annualy : ");
		double interestRateYear = input.nextDouble();
		double interestRateMount = interestRateYear / 1200;
		System.out.print("Enter the Month : ");
		int month = input.nextInt();
		double totalSaving = 0;
		for (int i = 1; i <= month; i++) {
			totalSaving = (totalSaving + saving) * (1 + interestRateMount);
		}
		
		System.out.println("After " + month + " Mounth Later, The Acoount Value : " + (int) (totalSaving * 100) / 100.0 + " TL");

	}

}
