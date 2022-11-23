package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Two Characters :");
		String s1 = input.next().toUpperCase();
		if (s1.charAt(0) == 'M') {
			System.out.print("Mathematics ");
			if (s1.charAt(1) == '1') {
				System.out.print("Freshman");
			} else if (s1.charAt(1) == '2') {
				System.out.print("Sophomore");
			} else if (s1.charAt(1) == '3') {
				System.out.print("Junior");
			} else if (s1.charAt(1) == '4') {
				System.out.print("Senior");
			} else {
				System.out.println("Invalid Value Input");
			}
		} else if (s1.charAt(0) == 'C') {
			System.out.print("Computer Science ");
			if (s1.charAt(1) == '1') {
				System.out.print("Freshman");
			} else if (s1.charAt(1) == '2') {
				System.out.print("Sophomore");
			} else if (s1.charAt(1) == '3') {
				System.out.print("Junior");
			} else if (s1.charAt(1) == '4') {
				System.out.print("Senior");
			} else {
				System.out.println("Invalid Value Input");
			}
		} else if (s1.charAt(0) == 'I') {
			System.out.print("Information Tecnology ");
			if (s1.charAt(1) == '1') {
				System.out.print("Freshman");
			} else if (s1.charAt(1) == '2') {
				System.out.print("Sophomore");
			} else if (s1.charAt(1) == '3') {
				System.out.print("Junior");
			} else if (s1.charAt(1) == '4') {
				System.out.print("Senior");
			} else {
				System.out.println("Invalid Value Input");
			}
		} else {
			System.out.print("Invalid Value Input");
		}
	}

}
