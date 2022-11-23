package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Speed(m/s) : ");
		double speed = input.nextDouble();
		System.out.print("Enter Airplan's Acceleration(m/^2) : ");
		double airplaneAcceleration = input.nextDouble();
		double lenght = (Math.pow(speed, 2))/(2*airplaneAcceleration);
		System.out.println("Airplane Length : "+((int)(lenght*1000)/1000.0));
	}

}
