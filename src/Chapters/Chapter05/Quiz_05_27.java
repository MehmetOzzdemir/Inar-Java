package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_27 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter The Begining Year : ");
		int firstYear=input.nextInt();
		System.out.print("Enter The Begining Year : ");
		int lastYear=input.nextInt();
		int count = 0;
		System.out.println();
		System.out.println("\t\tThe Leap Year");
		System.out.println("\t___________________________");
		for (int leapYear = firstYear; leapYear <= lastYear; leapYear++) {
			if (leapYear % 400 == 0 || (leapYear % 4 == 0 && leapYear % 100 != 0)) {
				count++;
				if (count % 10 == 0) {
					System.out.println(leapYear);
				} else {
					System.out.print(leapYear + " ");
				}
			}
		}
	}

}
