package volkanhocaexercises;

import java.util.Scanner;

public class FahrenaitToCelcius {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		System.out.print("Fahrenait = ");
		int fahrenait = input.nextInt();
		
		double celcius= (5/9)*(fahrenait-32);
		
		System.out.print(fahrenait+" Fahrenait = "+ celcius +" Celcius " );

	}

}
