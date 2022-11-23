package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Your Weight (Pound) : ");
		double weight = input.nextDouble();
		System.out.print("Your Height (İnches) : ");
		double height = input.nextDouble();

		double weightKg = weight * 0.45359237;
		double heightMeters = height * 0.0254;
		double bmi = weightKg / (heightMeters * heightMeters);

		System.out.println("Your BMI : " + (int) (bmi * 100) / 100.0);

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
