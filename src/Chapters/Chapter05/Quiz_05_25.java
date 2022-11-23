package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_25 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double Pi = 0.0;
		System.out.print("Enter The Last Value : ");
		int Last=input.nextInt();
		for (int i = 1; i <= Last; i++) {
			Pi += (Math.pow((-1), i + 1)) / (2 * i - 1);
			for (int j = 1; j <= i/10000; j++) {
				if (i == 10000 * j) {
					Pi *= 4.;
					System.out.println("PI value for "+i+" : "+Pi);
					Pi /= 4;
				}
			}
		}
	}

}
