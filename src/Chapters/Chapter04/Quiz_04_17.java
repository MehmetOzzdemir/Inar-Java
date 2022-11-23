package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A Year : ");
		int year = input.nextInt();
		System.out.print("Enter A Month : ");
		String month = input.next();

		boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0));

		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul")
				|| month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
			System.out.print(month + " " + year + " " + 31 + " days");
		} else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
			System.out.print(month + " " + year + " " + 30 + " days");
		} else {
			if (leapYear) {
				System.out.print(month + " " + year + " " + 29 + " days");
			}
			if (!leapYear) {
				System.out.print(month + " " + year + " " + 28 + " days");
				;
			}
		}

	}

}
