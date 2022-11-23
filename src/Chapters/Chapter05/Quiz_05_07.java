package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The tutuion Value : ");
		double tuition = input.nextDouble();
		double percentage = 1.05;
		System.out.print("Enter The Years : ");
		int totalYear = input.nextInt();
		double fourYears = 0;
		double tenYears = 0;
		for (int i = 1; i <= totalYear; i++) {
			double total = tuition * percentage;
			if (i == 10) {
				fourYears = total;
			} else if (i> 10) {
				tenYears = total;
			}
			double Last = tenYears - fourYears;
			System.out.println(i + ". Year : " + (int) (total * 100) / 100.0);
			tuition = total;
		}
		double last = tenYears - fourYears;
		System.out.println("14.Years - 10.Years : "+(int) (last * 100) / 100.0);
	}

}
