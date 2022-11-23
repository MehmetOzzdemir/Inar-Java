package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The First String : ");
		String s1 = input.nextLine();
		System.out.print("Enter The Second String : ");
		String s2 = input.nextLine();
		String prefix = "";
		int count = 0;
		while (s1.charAt(count) == s2.charAt(count)) {
			prefix += s1.charAt(count);
			count++;
		}
		if (prefix.length() > 0) {
			System.out.println("The common prefix to " + prefix);
		} else {
			System.out.println(s1 + " and " + s2 + " have no common prefix");
		}
	}
}
