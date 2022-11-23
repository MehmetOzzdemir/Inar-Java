package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Your Subtotal : ");
		double total = input.nextDouble();
		double tipsrate = 0.15;
		double tips = tipsrate * total;
		System.out.println("Your Tip is " + tips+" TL");
		System.out.println("Your COST : " +(total+tips)+" TL");
	}

}
