package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates : ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		System.out.print("Enter a point with two coordinates for Circle Center : ");
		double circleX = input.nextDouble();
		double circleY = input.nextDouble();
		System.out.print("Enter Radius of Circle : ");
		int radius = input.nextInt();
		double circle = Math.sqrt(Math.pow((circleX - x), 2) + Math.pow((circleY - y), 2));
		if (circle <= radius) {
			System.out.print("Point (" + x + " , " + y + ") is in the circle ");
		} else
			System.out.print("Point (" + x + " , " + y + ") is not in the circle ");
	}

}
