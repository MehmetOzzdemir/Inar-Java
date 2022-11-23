package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Temperature (Fahrenait) : ");
		double degree = input.nextDouble();
		System.out.print("Enter Wind Speed (>=) : ");
		double speed = input.nextDouble();
		double windChillTemperature = 35.74 + (0.6215 * degree) - (35.75 * (Math.pow(speed, 0.16)))
				+ (0.4275 * degree * (Math.pow(speed, 0.16)));
		// System.out.println("The Wind-Chill Temperature is " + windChillTemperature);
		if (degree > -58 && degree < 41) {
			if (speed >= 2) {
				System.out.println("The Wind-Chill Temperature is " + (int) (windChillTemperature * 100) / 100.0);
			} else
				System.out.println("Invalid Wind Speed Value");

		} else
			System.out.println("Invalid Fahrenait Value");
	}

}
