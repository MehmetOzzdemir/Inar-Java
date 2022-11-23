package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint_03_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Exam Note : ");
		double score = input.nextDouble();
		if (score < 70 && score >= 60.0) {
			System.out.println("Your Exam Note is " + "D");
		} else if (score >= 70.0 && score < 80.0) {
			System.out.println("Your Exam Note is " + "C");
		} else if (score >= 80.0 && score < 90.0) {
			System.out.println("B");
		} else if (score >= 90.0 && score <= 100.0) {
			System.out.println("Your Exam Note is " + "A");
		} else if (score < 0 || score > 100) {
			System.out.println("!!! Enter Your Exam Note between 0 to 100 !!!");
		} else {
			System.out.println("Your Exam Note is " + "F");
		}
	}

}
