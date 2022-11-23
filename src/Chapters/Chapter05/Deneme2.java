package chapters.chapter_05;

import java.util.Scanner;

public class Deneme2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = 0;
		System.out.println("\t\t\t The Pyramid");
		System.out.println("\t\t\t ____________");
		System.out.println();
		int number2 = 7;
		for (int row=1;row<=128;row+=row) {
			for(int space=0;space<number2;space++) {
				System.out.print("    ");
			}
			for(int i=1;i<=row;i+=i) {
				System.out.printf("%4d",(i));
			}
			for(int j=number1;j>0;j/=2) {
				System.out.printf("%4d",(j));
			}
			System.out.println();
			number2--;
			number1=row;
		}
	}

}
