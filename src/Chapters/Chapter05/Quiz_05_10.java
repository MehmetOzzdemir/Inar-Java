package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_10 {

	public static void main(String[] args) {
		// Scanner input =new Scanner (System.in);
		int colum = 10;
		int count = 0;
		for (int i = 100; i < 1001; i++) {
			if (i % 6 == 0 && i % 5 == 0) {
				count++;
				if (count % colum == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
			}
		}
	}
}
