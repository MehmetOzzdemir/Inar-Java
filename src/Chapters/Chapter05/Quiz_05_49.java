package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A String : ");
		String s1 = input.nextLine().toUpperCase().replaceAll(" ", "");
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'A' || s1.charAt(i) == 'E' || s1.charAt(i) == 'I' || s1.charAt(i) == 'İ'
					|| s1.charAt(i) == 'U' || s1.charAt(i) == 'Ü' || s1.charAt(i) == 'O' || s1.charAt(i) == 'Ö') {
				count1++;
			} else {
				count2++;
			}
		}
		System.out.println("The number of vowels is " + count1);
		System.out.println("The number of consonants is " + count2);
	}

}
