package volkanhocaexercises;

import java.util.Scanner;

public class Exercises_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius ;
		double area ;
		
		System.out.print("For Area Please Radius : ");
		radius =input.nextDouble();
		area = radius*radius*3.14159;
		System.out.print("Area : "+area);

	}

}
