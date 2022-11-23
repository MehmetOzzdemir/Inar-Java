package volkanhocaexercises;

import java.util.Scanner;

public class SimpleIfDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int number = input.nextInt();
		if (number % 2 == 0) {
			System.out.println("Hi Even");

		}
		else {
			System.out.println("Hi Odd");
		}
	}
}
