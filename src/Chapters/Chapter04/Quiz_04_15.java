package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A Letter : ");
		String letter = input.next().toLowerCase();
		if (letter.equals("a") || letter.equals("b") || letter.equals("c")) {
			System.out.print("The Corresponding Number is " + 2);
		} else if (letter.equals("d") || letter.equals("e") || letter.equals("f")) {
			System.out.print("The Corresponding Number is " + 3);
		} else if (letter.equals("g") || letter.equals("h") || letter.equals("i") || letter.equals("ı")
				|| letter.equals("ğ")) {
			System.out.print("The Corresponding Number is " + 4);
		} else if (letter.equals("j") || letter.equals("k") || letter.equals("l")) {
			System.out.print("The Corresponding Number is " + 5);
		} else if (letter.equals("m") || letter.equals("n") || letter.equals("o") || letter.equals("ö")) {
			System.out.print("The Corresponding Number is " + 6);
		} else if (letter.equals("p") || letter.equals("r") || letter.equals("s") || letter.equals("q")) {
			System.out.print("The Corresponding Number is " + 7);
		} else if (letter.equals("t") || letter.equals("u") || letter.equals("v") || letter.equals("ü")) {
			System.out.print("The Corresponding Number is " + 8);
		} else if (letter.equals("w") || letter.equals("y") || letter.equals("x") || letter.equals("z")) {
			System.out.print("The Corresponding Number is " + 9);
		} else if (letter.equals(" ")) {
			System.out.print("The Corresponding Number is " + 0);
		} else {
			System.out.print(letter + " is an invalid input");
		}
	}

}
