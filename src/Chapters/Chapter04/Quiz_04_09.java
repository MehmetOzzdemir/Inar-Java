package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_09 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter A Character : ");
		String s =input.next();
		
		char ch =s.charAt(0);
		
		System.out.println("The Character for the Character "+s+" is "+(int)ch);
	}

}
