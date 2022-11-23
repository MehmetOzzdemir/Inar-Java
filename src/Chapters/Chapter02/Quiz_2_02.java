package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159;

		System.out.print("Please Radius : ");
		double radius = input.nextDouble();
		System.out.print("Please Lenght : ");
		double lenght = input.nextDouble();

		double area = radius * radius * PI;
		double volume = area * lenght;
		System.out.println("The Area : " + area);
		System.out.print("The volume : " + volume);

	}

}
