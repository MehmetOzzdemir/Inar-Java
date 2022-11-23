package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_32 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Your Lottery Numbers : ");
		int twoDigitNumber=input.nextInt();
		int firstNumber =twoDigitNumber/10;
		int secondNumber =twoDigitNumber%10;
		System.out.println("__________________________");
		
		
		int lotteryNum1=(int)(Math.random()*10);
		int lotteryNum2=(int)(Math.random()*10);

		while(lotteryNum1==lotteryNum2) {
			lotteryNum2=(int)(Math.random()*10);
		}
		System.out.println("The Lottery Number : "+lotteryNum1+lotteryNum2);
		System.out.println("__________________________");
		
		if(firstNumber==lotteryNum1 && secondNumber==lotteryNum2) {
			System.out.println("You Win $10.000 ");
		}else if(firstNumber==lotteryNum2 && secondNumber==lotteryNum1) {
			System.out.println("You Win $3.000 ");
		}else if(firstNumber==lotteryNum1 || secondNumber==lotteryNum1 || 
				firstNumber==lotteryNum2 || secondNumber==lotteryNum2) {
			System.out.println("You Win $1.000 ");}
		else {
			System.out.println(" You Lost :( ");
		}
		
	}

}
