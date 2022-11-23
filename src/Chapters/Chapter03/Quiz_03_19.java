package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("First Side :");
		double x=input.nextDouble();
		System.out.print("Second Side :");
		double y=input.nextDouble();
		System.out.print("Third Side :");
		double z=input.nextDouble();
		//y-z<x<y+z
		//x-z<y<x+z
		//x-y<z<x+y
		
		if(Math.abs(y-z)<x && x<(y+z)) {
			if(Math.abs(x-z)<y && y<(x+z)) {
				if(Math.abs(x-y)<z && z<(x+y)) {
					double perimeter =x+y+z;
					System.out.println("Perimeter of Triangle : "+(perimeter));
				}
			}
		}
		else {
			System.out.println("This Triangle is invalid");
		}
		
	}

}
