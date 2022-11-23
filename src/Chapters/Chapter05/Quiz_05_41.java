package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_41 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter Numbers : ");
		int number=1;
		int count=1;
		int max=0;
		while(number !=0) {
			number =input.nextInt();
			if(number>max) {
				count=0;
				max=number;
				
			}if(number ==max) {
				count++;
			}
		}
		System.out.println("The Largest Number is "+max);
		System.out.println("The Occurrence Count Of The Largest Number is  "+count);
	}
}