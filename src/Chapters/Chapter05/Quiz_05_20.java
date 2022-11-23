package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Line Number :");
		int line = input.nextInt();
		int count = 0;
		System.out.print("Enter Between 2 to Number ? : ");
		int number = input.nextInt();
		System.out.println();
		System.out.println(" Between 2 To " + number + " Prime Number ");
		System.out.println("___________________________________________");
		for (int numbers = 2; numbers < number; numbers++) {
			boolean isPrime = true;
			for (int divisor = 2; divisor <= numbers / 2; divisor++) {
				if (numbers % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				if (count % line == 0) {
					System.out.println(numbers);
				} else {
					System.out.print(numbers + " ");
				}
			}

		}
	}

}
