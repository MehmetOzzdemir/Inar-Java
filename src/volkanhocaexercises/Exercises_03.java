package volkanhocaexercises;

import java.util.Scanner;

public class Exercises_03 {

	public static void main(String[] args) {
		System.out.print("Second: ");
		Scanner input =new Scanner(System.in);
		int second =input.nextInt();
		
		int minute = second /60 ;
		
		int LastSecond = second%60;
		
		System.out.println(second+" second "+minute+" minute "+LastSecond+" second");

	}

}
