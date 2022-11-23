package chapters.chapter_05;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Line Number : ");
		int line =input.nextInt();
		int count =0;
		System.out.println("Between 2 To 1000 Prime Number ");
		System.out.println("________________________________");
		for(int number=2 ;number<1000;number++) {
			boolean isPrime =true;
			for(int divisor=2;divisor<=number/2;divisor++) {
				if(number%divisor==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				count++;
				if(count%line==0) {
					System.out.println(number);
				}
				else {
					System.out.print(number+" ");
				}
			}
		}
	}

}
