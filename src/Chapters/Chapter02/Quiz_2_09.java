package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_09 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Please First Velocity : ");
		double v1 = input.nextDouble();
		System.out.print("Please Second Velocity : ");
		double v2 = input.nextDouble();
		System.out.print("Please Write Time (Second) : ");
		double time =input.nextDouble();
		double acceleration =(v2-v1)/time;
		System.out.print("Your Acceleration is "+(int)(acceleration*100)/100.0);
	}

}
