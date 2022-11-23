package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Write Numbers (0-1000) : ");
		int number = input.nextInt();
		int number1 = number / 100;
		int number2 = (number / 10) % 10;
		int number3 = number % 10;
		
		System.out.println(number1+number2+number3);
	}

}
