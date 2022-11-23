package Inar.InarInterview;

import java.util.Scanner;

public class Interwiew_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First String : ");
		String s1 = input.nextLine();
		System.out.print("Enter Second String : ");
		String s2 = input.nextLine();
		s1=IsPresentInNewString(s1, s2);
		System.out.println("Last String is "+s1);
	}

	public static String IsPresentInNewString(String s1, String s2) {
		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < s2.length() - 1; j++)
				s1 = RemoveOneCharacter(s1, s2.charAt(i));
		}
		return s1;
	}

	public static String RemoveOneCharacter(String s1, char ch) {
		String result = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ch) {
				result += s1.charAt(i);
			}
		}
		return result;
	}
}
