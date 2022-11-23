package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Write Celsius Degree : ");
		double celsius =input.nextDouble();
		double fahrenait =(9.0/5)*celsius+32;
		System.out.print(celsius+" Degree : "+fahrenait+ " Degree.");
		
	}

}
