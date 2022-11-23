package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A String : ");
		String s1 = input.nextLine();
		String s2 = "";
		for (int i = 1; i < s1.length(); i += 2) {
			s2 += s1.charAt(i);
		}
		System.out.print(s2);
	}

}
