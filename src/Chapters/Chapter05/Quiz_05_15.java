package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_15 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		int count=0;
		System.out.print("Enter Characters per Line : ");
		int characterNumber=input.nextInt();
		System.out.println("\tASCII TABLE");
		for (int i=33;i<124;i++) {
			count++;
			if(count%characterNumber!=0) {
			System.out.print(" "+(char)i);
		}else {
			System.out.print("\n"+(char)i);
		}
	}
	}
}
