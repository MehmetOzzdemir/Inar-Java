package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Amount Of Water in Kilograms : ");
		double waterKilograms = input.nextDouble();
		System.out.print("Enter Initial Temperatures : ");
		double initialTemperature = input.nextDouble();
		System.out.print("Enter Final Temperatures : ");
		double finalTemperature = input.nextDouble();
		double energy = waterKilograms*(finalTemperature-initialTemperature)*4184;
		System.out.print("!!! You need "+energy+" Energy. !!!");
		
	}

}
