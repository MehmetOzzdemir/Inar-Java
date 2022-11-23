package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_07 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
			

		System.out.print("Amount Of Money : ");
		double moneyAmount = input.nextDouble();
		int kurus = (int) (moneyAmount * 100);
		int oneLiras = kurus / 100;
		

		System.out.println(moneyAmount + " Liras equalty " + (kurus + " Kurus"));
		System.out.println(moneyAmount + " Liras equalty " + (oneLiras + "  adet 1 Liras"));
		int lastKurus = kurus % 100;
		int fiftyKurus = lastKurus / 50;
		System.out.println(moneyAmount + " Liras equalty " + ((fiftyKurus)) + " adet 50 Kurus");
		lastKurus = lastKurus % 50;
		int twentyFiveKurus = lastKurus / 25;
		System.out.println(moneyAmount + " Liras equalty " + ((twentyFiveKurus)) + " adet 25 Kurus");
		lastKurus = lastKurus % 25;
		int tenKurus = lastKurus / 10;
		System.out.println(moneyAmount + " Liras equalty " + ((tenKurus)) + " adet 10 Kurus");
		lastKurus = lastKurus % 10;
		int fiveKurus = lastKurus / 5;
		System.out.println(moneyAmount + " Liras equalty " + ((fiveKurus)) + " adet 5 Kurus");
		lastKurus = lastKurus % 5;
		int oneKurus = lastKurus / 1;
		System.out.println(moneyAmount + " Liras equalty " + ((oneKurus)) + " adet 1 Kurus");

	}

}