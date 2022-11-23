package chapters.chapter_05;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz_05_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student Numbers : ");
		int student = input.nextInt();
		String highScoreStudent ="";

		double highScore = 0;

		for (int i = 0; i < student; i++) {
			System.out.print((i + 1) + ".Student Name : ");
			String studentName = input.next();
			System.out.print("Enter Score : ");
			double score = input.nextDouble();
			
			if (score > highScore) {
				highScore=score;
				highScoreStudent = studentName;
			}

		}
		System.out.println("High Score Student Name is "+highScoreStudent+" and Student's Score is "+highScore);
	}

}
