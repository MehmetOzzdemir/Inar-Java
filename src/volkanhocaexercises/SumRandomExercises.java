package volkanhocaexercises;
import java.util.Scanner;
public class SumRandomExercises {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		System.out.println(number1 +" +  "+ number2 +" =?");
		int sum = input.nextInt();
		if(number1 + number2 == sum) {
			System.out.println("True Solution");
		}
		else
			System.out.println("False Solution");
		
	}

}
