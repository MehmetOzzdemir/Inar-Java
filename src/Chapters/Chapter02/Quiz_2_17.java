package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Temperature (Fahrenait) : ");
		double degree = input.nextDouble();
		System.out.print("Enter Wind Speed (>=) : ");
		double speed = input.nextDouble();
		double windChillTemperature = 35.74 + (0.6215 * degree) - (35.75 * (Math.pow(speed, 0.16)))
				+ (0.4275 * degree * (Math.pow(speed, 0.16)));
		System.out.println("The Wind-Chill Temperature is "+windChillTemperature);
	}

}
