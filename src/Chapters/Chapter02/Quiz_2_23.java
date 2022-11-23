package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Driving Distance : ");
		double distance = input.nextDouble();
		System.out.print("Enter Kilometer Per Liter : ");
		double kilometer = input.nextDouble();
		System.out.print("Enter Price Per Liter : ");
		double price = input.nextDouble();

		double costDriving = distance / kilometer * price;
		System.out.print("The cost of driving is " + (int)(costDriving*100)/100.0+" TL");
	}

}
