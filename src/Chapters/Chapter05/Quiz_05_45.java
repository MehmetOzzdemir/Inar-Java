package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How Many Numbers Do You Want To Enter? ");
		int number = input.nextInt();
		double numbers;
		double sum = 0;
		double powSum = 0;
		double mean;
		double devision;
		System.out.print("Enter " + number + " Number : ");
		for (int i = 0; i < number; i++) {
			numbers = input.nextDouble();
			sum += numbers;
			powSum += (Math.pow(numbers, 2));
			
		}
		mean = sum / number;
		System.out.println("The mean is " + mean);
		devision = Math.sqrt(((powSum - (Math.pow(sum, 2) / number)) / (number - 1)));
		System.out.println("The standard deviation is " + (int)(devision*100000)/100000.);
	}
}
