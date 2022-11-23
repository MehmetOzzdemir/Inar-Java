package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_05 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter The Number Of Side : ");
		int n=input.nextInt();
		System.out.print("Enter The Side : ");
		double s=input.nextDouble();
		
		double area =(n*(s*s))/(4*Math.tan(Math.PI/n));
		System.out.print("The area of the polygon is "+(int)(area*100)/100.);
	}

}
