package chapters.chapter_03;

//import java.util.Scanner;

public class Quiz_03_16 {

	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);

		int width = (int) ((Math.random() * (101)) - 50);
		int height = (int) ((Math.random() * (201)) - 100);

		System.out.println("Random coordinate in rectangle centered at (0,0)");
		System.out.println("width 100 and height 200: (" + width + ", " + height + ")");
	}

}
