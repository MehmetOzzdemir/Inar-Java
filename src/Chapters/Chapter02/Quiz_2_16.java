package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Side of Hexagon : ");
		double hexagon = input.nextDouble();
		
		double area = ((3*(Math.pow (3, 0.5)))/2)*(hexagon*hexagon);
		System.out.print("Area of Hexagon : "+ area);
	}

}
