package volkanhocaexercises;

import java.util.Scanner;

public class Exercises_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("For Average Please 3 Number = ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double average=(number1+number2+number3)/3;
		System.out.println("Average = "+ average);

	}

}
