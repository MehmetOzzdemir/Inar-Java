package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = (int) (Math.random() * 3);

		System.out.print("scissor (0), rock (1), paper (2):");
		int myNumber = input.nextInt();
		System.out.print("The computer is ");
		switch (number) {
		case 0:
			System.out.print("scissor.");
			break;
		case 1:
			System.out.print("rock.");
			break;
		case 2:
			System.out.print("paper.");
			break;
		}
		System.out.print("You are ");
		switch (myNumber) {
		case 0:
			System.out.print("scissor.");
			break;
		case 1:
			System.out.print("rock.");
			break;
		case 2:
			System.out.print("paper.");
			break;
		}

		if (number == myNumber) {
			System.out.print("It is draw.");
		} else if ((number == 0 && myNumber == 1) || (number == 1 && myNumber == 2) || (number == 2 && myNumber == 0)) {
			System.out.print("You Win.");
		} else
			System.out.print("You Lose.");

	}

}
