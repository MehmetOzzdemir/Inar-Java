package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_27 {

	public static void main(String[] args) {
		//y-100=-x/2 doğrunun denklemi
		Scanner input =new Scanner (System.in);
		System.out.print("Enter a point's x- and y-coordinates:");
		double x =input.nextDouble();
		double y =input.nextDouble();
		if (y<=(-x/2)+100 && y>0 && x>0) {
			System.out.println("The point is in the triangle ");
		}else {
			System.out.println("The point is not in the triangle");
		}
	}

}
