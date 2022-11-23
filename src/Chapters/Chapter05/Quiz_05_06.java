package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double kilometersCurrency = 1.609;
		System.out.println("\t____________________                    _______________________");
		System.out.println("\t|Miles\t|Kilometers|\t\t\t|Kilometers|\t|Miles|");
		System.out.println("\t____________________                    _______________________");
		System.out.println();
		int cycle = 11;
		double  kilometers2=15;
		for (int i = 1; i < cycle; i++) {
			System.out.print("\t|" + i);
			double kilometer = kilometersCurrency * i;
			System.out.print("\t|" + (int) (kilometer * 1000) / 1000.0);
			kilometers2+=5;
			double miles =kilometers2/kilometersCurrency;	
				System.out.println("\t\t\t\t|"+kilometers2+"\t\t|" + (int) (miles * 1000) / 1000.0);
				
			
		}
	}

}
