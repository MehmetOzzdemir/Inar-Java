package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A String : ");
		String s1 =input.next();
		String reverse ="";
		for(int i=s1.length()-1;i>=0;i--) {
			reverse+=s1.charAt(i);
		}
		System.out.print("The reversed String is "+reverse);
	}

}
