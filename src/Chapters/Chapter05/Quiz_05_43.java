package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_43 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Begin Number For The Combinations : ");
		int beginNumber = input.nextInt();
		System.out.print("Enter Last Number For The Combinations : ");
		int lastNumber = input.nextInt();
		System.out.println();
		int count = 0;
		System.out.println("ALL COMBINATION");
		System.out.println("_______________");
		System.out.println();
		for (int i = beginNumber; i < lastNumber; i++) {
			for (int j = i+1; j <= lastNumber; j++) {
				System.out.println(i + " " + j);
				count++;
			}
		}
		System.out.println("The total number of all combinations is " + count);
	}

}
