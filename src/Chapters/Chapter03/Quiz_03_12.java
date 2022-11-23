package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a three digit integer : ");
		int number =input.nextInt();
		int digit1 = number /100;
		int remain = number %100;
		int digit3 = remain%10;
		
		if(digit1==digit3) {
			System.out.print(number +" is a palindrome ");
		}else
			System.out.print(number +" is not a palindrome ");
		
	}

}
