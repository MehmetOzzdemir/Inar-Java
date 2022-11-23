package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_03 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter a,b,c,d,e,f : ");
		double a = input.nextDouble();
        double b = input.nextDouble();
        double c =input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double number =(a * d - b * c);
        double x = (e * d - b * f) / number;
        double y = (a * f - e * c) / number;
        if(number ==0) {
        	System.out.println("The equation has no solution");
        }else
        System.out.println("x = " + x + ", y = " + y);
	}

}
