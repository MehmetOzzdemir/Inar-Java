package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Write Feet : ");
		double feet = input.nextDouble();
		double meter = feet * 0.305;
		System.out.println(feet + " Feet : " + meter + " Meters");
	}

}
