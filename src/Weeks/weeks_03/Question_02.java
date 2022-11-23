package weeks.weeks_03;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Person 1's Year:");
		int people1 = input.nextInt();
		System.out.print("Person 2's Year:");
		int people2 = input.nextInt();
		System.out.print("Person 3's Year:");
		int people3 = input.nextInt();
		if (people1 > people2 && people1 > people3 && people2 > people3) {
			System.out.println("The Younger person " + people3 + " years old.");
			System.out.println("The Second person " + people2 + " years old.");
			System.out.println("The Older person " + people1 + " years old.");
		} else if (people2 > people1 && people2 > people3 && people1 > people3) {
			System.out.println("The Younger person " + people3 + " years old.");
			System.out.println("The Second person " + people1 + " years old.");
			System.out.println("The Older person " + people2 + " years old.");
		} else if (people3 > people1 && people3 > people2 && people2 > people1) {
			System.out.println("The Younger person " + people1 + " years old.");
			System.out.println("The Second person " + people2 + " years old.");
			System.out.println("The Older person " + people3 + " years old.");
		}else if (people2 > people1 && people2 > people3 && people3>people1) {
			System.out.println("The Younger person " + people1 + " years old.");
			System.out.println("The Second person " + people3 + " years old.");
			System.out.println("The Older person " + people2 + " years old.");
		}else if (people3 > people1 && people3 > people2 && people1>people2) {
			System.out.println("The Younger person " + people2 + " years old.");
			System.out.println("The Second person " + people1 + " years old.");
			System.out.println("The Older person " + people3 + " years old.");
		}else if (people1 > people2 && people1 > people3 && people3>people2) {
			System.out.println("The Younger person " + people2 + " years old.");
			System.out.println("The Second person " + people3 + " years old.");
			System.out.println("The Older person " + people1 + " years old.");
		}
		

	}
}
