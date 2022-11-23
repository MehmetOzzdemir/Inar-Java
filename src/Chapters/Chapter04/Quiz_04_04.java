package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Side : ");
		double s = input.nextDouble();
		
		double area =(6*s*s)/(4*Math.tan(Math.PI/6));
		System.out.print("The Area of The Hexagon is "+(int)(area*100)/100.0);
	}

}
