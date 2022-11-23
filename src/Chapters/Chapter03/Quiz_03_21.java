package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year (e.g. 2002)  : ");
		int year = input.nextInt();
		System.out.print("Enter Month (1-12)  : ");
		int month = input.nextInt();
		System.out.print("Enter the day of month (1-31)  : ");

		if (month == 1 || month == 2) {
			month = month + 12;
			year = year - 1;
		}
		int dayofMonth = input.nextInt();
		int century = year / 100;
		int yearOfCentury = year % 100;

		int dayOfWeek = (dayofMonth + (26 * (month + 1) / 10) + (yearOfCentury) + (yearOfCentury / 4) + (century / 4)
				+ (5 * century)) % 7;
		String day = null;

		switch (dayOfWeek) {

		case 0:
			day = "Saturday";
			break;
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;

		}

		System.out.println("Day of the week is " + day);
	}

}
