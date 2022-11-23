package weeks.weeks_03;

import java.util.Scanner;

public class Question_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 4 Digit Number : ");
		int number = input.nextInt();
		int first = number / 1000;
		int second = (number % 1000) / 100;
		int third = (number % 100) / 10;
		int forth = number % 10;
		System.out.print(number+" Number's Reverse Number : "+forth+""+third+""+second+""+first);

	}

}
