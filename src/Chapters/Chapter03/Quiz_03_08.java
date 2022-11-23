package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a,b,c : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double min;
		double med;
		double max;
		if (a < b) {
			min = a;
		} else
			min = b;
		if (min < c) {
			min = min;
		} else
			min = c;

		if (a > b) {
			max = a;
		} else
			max = b;
		if (max > c) {
			max = max;
		} else
			max = c;

		if (a != min && a != max) {
			med = a;
		} else if (b != min && b != max) {
			med = b;
		} else
			med = c;
		System.out.println("The minumum number is "+min);
		System.out.println("The medium number is "+med);
		System.out.println("The maximum number is "+max);
	}

}
