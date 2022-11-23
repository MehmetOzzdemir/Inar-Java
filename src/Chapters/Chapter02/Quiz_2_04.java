package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Write Pound : ");
		double pound = input.nextDouble();
		double kilogram = pound * 0.454;
		System.out.println(pound + " Pound is " + kilogram + " Kilograms.");
	}

}
