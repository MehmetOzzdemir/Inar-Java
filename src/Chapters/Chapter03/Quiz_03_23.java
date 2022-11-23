package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates : ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		System.out.print("Enter Winth and Heiht of Rectangle : ");
		double rectangledHorizantal = input.nextDouble();
		double rectangleVertical = input.nextDouble();
		double rectangle = Math.sqrt(Math.pow(((rectangledHorizantal/2) - x), 2) + Math.pow(((rectangleVertical/2) - y), 2));
		if (x <= (rectangledHorizantal/2) || y<=(rectangleVertical/2)) {
			System.out.print("Point (" + x + " , " + y + ") is in the rectangle ");
	}
		else 
			System.out.print("Point (" + x + " , " + y + ") is not in the rectangle ");
}}
