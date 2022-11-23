package volkanhocaexercises;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Your Weight (kg) : ");
		double weight = input.nextDouble();
		System.out.print("Your Height (m) : ");
		double height = input.nextDouble();
		
		double bmi = weight/(height*height);
		
		System.out.println("Your BMI : "+bmi);
		
		if (bmi<18.5) {
			System.out.println("You are !!!UNDERWEİGHT!!!");
			
		}else if (bmi>18.5 && bmi<=25.0) {
			System.out.println("You are !!!NORMAL!!!");
		}else if(bmi>=25.0 && bmi<30.0){
			System.out.println("You are !!!OVERWEİGHT!!!");
		}else if(bmi>=30.0){
			System.out.println("You are !!!OBESE!!!");
		}
	}

}
