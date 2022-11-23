package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s1 = "";
		boolean Continue = true;
		while (Continue==true) {
			int count1 = 0;
			int count2 = 0;
			for (int i = 0; i >= 0; i++) {
				int number = (int) (Math.random() * 3);
				System.out.print("Scissor (0), Rock (1), Paper (2):");
				int myNumber = input.nextInt();
				System.out.print("The computer is ");
				Scissors(number);
				System.out.print("You are ");
				Scissors(myNumber);
				if (number == myNumber) {
					System.out.println("It is draw.");
				} else if ((number == 0 && myNumber == 1) || (number == 1 && myNumber == 2)
						|| (number == 2 && myNumber == 0)) {
					System.out.println("You Win.");
					count1++;
				} else {
					System.out.println("You Lose.");
					count2++;
				}
				System.out.println();
				if (count1 - count2 == 2 || count2 - count1 == 2) {
					if (count1 > count2) {
						System.out.println("You Score : " + count1);
						System.out.println("The Compuuter Score :" + count2 + "\n");
						System.out.println("!!! YOU WİN !!!\n");
					} else if (count2 > count1) {
						System.out.println("You Score : " + count1);
						System.out.println("The Computer Score :" + count2 + "\n");
						System.out.println("!!! THE COMPUTER WİN YOU LOST !!!\n");
					}
					break;
				}
			}
			System.out.print("DO YOU WANT PLAY AGAIN?(Y/N)");
				s1 = input.next().toLowerCase();
				if (s1.charAt(0) == 'y') {
					System.out.println("________________________");
					System.out.print("THE NEXT ROUND READY\n");
					System.out.println("________________________");
					Continue = true;

				} else if (s1.charAt(0) == 'n') {
					System.out.println("________________________");
					System.out.print("GOOD BYE SEE YOU LATER\n");
					System.out.println("________________________");
					Continue = false;
					//break;
				}else {
					System.out.println("________________________");
					System.out.print("GOOD BYE SEE YOU LATER\n");
					System.out.println("________________________");
					Continue=false;
					//break;
				}
		}
	}

	public static int Scissors(int num1) {

		switch (num1) {
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
		return num1;
	}
}
