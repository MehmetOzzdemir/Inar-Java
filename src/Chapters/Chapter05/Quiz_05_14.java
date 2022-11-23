package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_14 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter First Number : ");
		int number1=input.nextInt();
		System.out.print("Enter Second Number : ");		
		int number2=input.nextInt();
		int d;
		if(number1<number2) {
			d=number1;
		}else {
			d=number2;
		}
		while(number1%d != 0 ||number2%d != 0 ) {
			d--;
		}
		System.out.print("The greatest common divisor for ("+number1+" , "+number2+") : "+d);
	}

}
