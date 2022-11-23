package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from the center to a vertex : ");
		double pentagon = input.nextDouble();
		double s = 2 * pentagon * Math.sin(Math.PI / 5);
		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		System.out.print("The area of The Pentagon is " + (int) (area * 100) / 100.0);
	}

}
