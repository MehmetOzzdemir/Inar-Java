package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A String : ");
		String s1 = input.nextLine().replaceAll(" ", "");

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			if(Character.isUpperCase(s1.charAt(i))){
				count++;
			}
			
		}
		System.out.print("The number of uppercase letters is " + count);
	}

}
