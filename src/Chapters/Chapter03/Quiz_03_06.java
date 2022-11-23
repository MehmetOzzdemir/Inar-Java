package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		final double FEET_PER_INCH = 0.0833333;

		System.out.print("Your Weight in Pounds : ");
		double pound = input.nextDouble();
		System.out.print("Your Feet : ");
		double feet = input.nextDouble();
		System.out.print("Enter Inches : ");
		double inch = input.nextDouble();

		double weight = pound * KILOGRAMS_PER_POUND;

		feet = feet / FEET_PER_INCH;
		inch = inch + feet;
		double height = inch * METERS_PER_INCH;
		double bmi = weight / (height * height);

		System.out.println("Your BMI : " + bmi);

		if (bmi < 18.5) {
			System.out.println("You are !!!UNDERWEİGHT!!!");

		} else if (bmi > 18.5 && bmi <= 25.0) {
			System.out.println("You are !!!NORMAL!!!");
		} else if (bmi >= 25.0 && bmi < 30.0) {
			System.out.println("You are !!!OVERWEİGHT!!!");
		} else if (bmi >= 30.0) {
			System.out.println("You are !!!OBESE!!!");
		}
	}

}
