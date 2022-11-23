package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Year : ");
		int year = input.nextInt();
		System.out.print("Enter First Day (0-6) (for example: 0=Sunday 2=Tuesday) : ");
		int firstDay = input.nextInt();
		
		int monthsDay = 0;
		System.out.println();
		
		for (int month = 1; month <= 12; month++) {
			switch (month) {
			case 1:
				monthsDay = 31;
				System.out.print("\t\tJanuary");
				break;
			case 2:
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
					monthsDay = 29;
				} else {
					monthsDay = 28;
				}
				System.out.print("\t\tFebruary");
				break;
			case 3:
				monthsDay = 31;
				System.out.print("\t\tMarch");
				break;
			case 4:
				monthsDay = 30;
				System.out.print("\t\tApril");
				break;
			case 5:
				monthsDay = 31;
				System.out.print("\t\tMay");
				break;
			case 6:
				monthsDay = 30;
				System.out.print("\t\tJune");
				break;
			case 7:
				monthsDay = 31;
				System.out.print("\t\tJuly");
				break;
			case 8:
				monthsDay = 31;
				System.out.print("\t\tAugust");
				break;
			case 9:
				monthsDay = 30;
				System.out.print("\t\tSeptember");
				break;
			case 10:
				monthsDay = 31;
				System.out.print("\t\tOctober");
				break;
			case 11:
				monthsDay = 30;
				System.out.print("\t\tNovember");
				break;
			case 12:
				monthsDay = 31;
				System.out.print("\t\tDecember");
				break;
			}
			System.out.println(" "+year);
			System.out.println("_____________________________________________________");
			System.out.println("Sun \t Mon \t Tue \t Wed \t Thu \t Fri \t Sat");
			System.out.println("_____________________________________________________");
			for (int i = 0; i < firstDay; i++) {
				System.out.print("\t ");
			}
			for (int j = 1; j <= monthsDay; j++) {
				if (j < 10) {
					System.out.print(j + "\t ");
				} else {
					System.out.print(j + "\t ");
				}
				if ((j + firstDay) % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			
			firstDay=(firstDay+monthsDay)%7;
		}
	}
}
