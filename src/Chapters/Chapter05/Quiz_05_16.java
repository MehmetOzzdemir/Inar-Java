package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_16 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter Factors' Number : ");
		int number = input.nextInt();
		int factors=number;
		int test =2;
		while(factors/test !=1) {
			if(factors%test== 0) {
				System.out.print(test + ".");
				factors/=test;
			}
			else {
				test++;
			}
		}
		System.out.print(factors+" Divisors for : "+number);
	}

}
