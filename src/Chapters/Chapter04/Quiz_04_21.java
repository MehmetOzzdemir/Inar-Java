package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_21 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter A SSN : ");
		String SSN = input.nextLine();
		
		boolean isValid = 
				(SSN.length() == 11) && 
				(Character.isDigit(SSN.charAt(0))) &&
				(Character.isDigit(SSN.charAt(1))) &&
				(Character.isDigit(SSN.charAt(2))) &&
				(SSN.charAt(3) == '-') &&
				(Character.isDigit(SSN.charAt(4))) &&
				(Character.isDigit(SSN.charAt(5))) &&
				(Character.isDigit(SSN.charAt(7))) &&
				(SSN.charAt(6) == '-') &&
				(Character.isDigit(SSN.charAt(8))) &&
				(Character.isDigit(SSN.charAt(9))) &&
				(Character.isDigit(SSN.charAt(10)));
		if(isValid) {
			System.out.print(SSN+ " is a valid Social Security Number");
		}else{
			System.out.print(SSN+ " is an invalid Social Security Number");

		}
	}

}
