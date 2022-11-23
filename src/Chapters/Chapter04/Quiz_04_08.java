package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII code : ");
		int ASCII =input.nextInt();
		
		System.out.print("The Character for ASCII code "+ASCII+" is "+(char)ASCII);	
	}

}
