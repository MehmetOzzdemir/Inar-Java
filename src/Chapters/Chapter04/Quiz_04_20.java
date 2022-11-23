package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_20 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter A String : ");
		String word=input.nextLine().replaceAll(" ", "");
		System.out.println("This String' First Character is "+word.charAt(0));
		System.out.println("This String' Length is "+word.length());
	}

}
