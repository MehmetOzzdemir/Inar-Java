package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A Decimal Value (0 to 15) : ");
		int decimal = input.nextInt();
		
		if (decimal >= 0 && decimal <= 9) {
			System.out.print("The Hex Value is " + decimal);
			
		}else if(decimal >= 10 && decimal <= 15) {
			System.out.print("The Hex value is "+(char)(decimal-10+'A'));
		}
		else {
			System.out.print(decimal+" is an invalid input.");
		}

	}

}
