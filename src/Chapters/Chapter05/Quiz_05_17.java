package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_17 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter Line Number : ");
		int line=input.nextInt();
		
		for(int row=1;row<=line;row++) {
			for (int space = (line-row); space >0; space--) {
			System.out.print("  ");
		}
			for (int numbers1=row;numbers1>0;numbers1--) {
				System.out.print(" "+numbers1);
			}
			for (int numbers2=2;numbers2<=row;numbers2++) {
				System.out.print(" "+numbers2);
			}
			System.out.println();
		//System.out.println(row+" ");
		
		}
	}

}
