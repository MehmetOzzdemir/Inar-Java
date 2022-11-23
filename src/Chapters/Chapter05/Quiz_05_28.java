package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Year : ");
		int year = input.nextInt();
		int monthsDay = 0;
		System.out.print("Enter First Day (0-6) (for example: 0=Sunday 2=Tuesday) : ");
		int firstDay = input.nextInt();
		int day = 1;
		for (int month = 1; month <= 12; month++) {
			firstDay %= 7;
			switch (month) {
			case 1:
				monthsDay = 31;
				System.out.print("January " + day + ", " + year + " is ");
				Days(firstDay);
				firstDay += monthsDay % 7;
				break;
			case 2:
				System.out.print("February " + day + ", " + year + " is ");
				Days(firstDay);
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
					monthsDay = 29;
					firstDay += monthsDay % 7;
				} else {
					monthsDay = 28;
					firstDay += monthsDay % 7;
				}
				break;
			case 3:
				monthsDay = 31;
				System.out.print("March " + day + ", " + year + " is ");
				Days(firstDay);
				firstDay += monthsDay % 7;
				;
				break;
			case 4:
				monthsDay = 30;
				System.out.print("April " + day + ", " + year + " is ");
				Days(firstDay);
				firstDay += monthsDay % 7;
				;
				break;
			case 5:
				monthsDay = 31;
				System.out.print("May " + day + ", " + year + " is ");
				Days(firstDay);
				firstDay += monthsDay % 7;
				;
				break;
			case 6:
				monthsDay = 30;
				System.out.print("June " + day + ", " + year + " is ");
				Days(firstDay);
				firstDay += monthsDay % 7;
				;
				break;

			case 7:
				monthsDay = 31;
				System.out.print("July " + day + ", " + year + " is ");
				Days(firstDay);
				firstDay += monthsDay % 7;
				;
				break;
			case 8:
				monthsDay = 31;
				System.out.print("August " + day + ", " + year + " is ");
				Days(firstDay);
				firstDay += monthsDay % 7;
				;
				break;
			case 9:
				monthsDay = 30;
				System.out.print("September " + day + ", " + year + " is ");
				Days(firstDay);
				firstDay += monthsDay % 7;
				;
				break;
			case 10:
				monthsDay = 31;
				System.out.print("October " + day + ", " + year + " is ");
				Days(firstDay);
				firstDay += monthsDay % 7;
				;
				break;
			case 11:
				monthsDay = 30;
				System.out.print("November " + day + ", " + year + " is ");
				Days(firstDay);
				firstDay += monthsDay % 7;
				;
				break;
			case 12:
				monthsDay = 31;
				System.out.print("December " + day + ", " + year + " is ");
				Days(firstDay);
				firstDay += monthsDay % 7;
				;
				break;
			}
		}
	}

	public static int Days(int num1) {
		switch (num1) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		}
		return num1;
	}

}
