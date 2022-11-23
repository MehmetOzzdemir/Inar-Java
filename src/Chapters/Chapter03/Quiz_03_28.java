package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();

		double X1X2dist = Math.sqrt(Math.pow(x1 - x2, 2));
		double Y1Y2dist = Math.sqrt(Math.pow(y1 - y2, 2));

		double Wdist1 = (w1 / 2) + (w2 / 2);
		double Hdist1 = (h1 / 2) + (h2 / 2);

		double Wdist2 = Math.sqrt(Math.pow((w1 / 2) - (w2 / 2), 2));
		double Hdist2 = Math.sqrt(Math.pow((h1 / 2) - (h2 / 2), 2));

		if (X1X2dist > Wdist1 || Y1Y2dist > Hdist1) {
			System.out.print("The rectangles are not overlap.");
		} else if (X1X2dist <= Wdist2 && Y1Y2dist <= Hdist2) {
			if (w1 > w2 && h1 > h2) {
				System.out.print("The second rectangle inside of the first rectangle.");
			} else if (w1 < w2 && h1 < h2) {
				System.out.print("The first rectangle inside of the second rectangle.");
			} else {
				System.out.print("The rectangles are overlap.");
			}

		} else {
			System.out.print("The rectangles are overlap.");

		}
	}

}
