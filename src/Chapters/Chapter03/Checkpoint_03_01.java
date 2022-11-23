package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint_03_01 {

	public static void main(String[] args) {
		// Checkpoint
		Scanner input = new Scanner(System.in);
		System.out.print("X : ");
		int x = input.nextInt();

		System.out.print("Y : ");
		int y = input.nextInt();
		if (y > 0) {
			x = 1;
			System.out.println("Y bigger Than 0 and New X Value : " + x);
		} else
			System.out.println("Y lower Than 0 and X Value : " + x);

		// Checkpoint 3.5/3.7
		System.out.print("Your Score : ");
		double score = input.nextDouble();
		if (score > 90) {
			score = (score * 0.03) + (score);
			System.out.println("Pay increased %3 :  " + score);
		} else {
			score = (score * 0.01) + (score);
			System.out.println("Pay not increased : " + score);
		}
	}

}
