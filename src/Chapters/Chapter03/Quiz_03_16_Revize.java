package chapters.chapter_03;

public class Quiz_03_16_Revize {

	public static void main(String[] args) {
		int number = (int) ((Math.random() * 4) + 1); // burası kenar tespit için
		// System.out.println(number);
		int height;
		int width;
		switch (number) {
		case 1:
			height = 50;
			width = (int) ((Math.random() * (201)) - 100);
			System.out.print("(" + height + "," + width + ")");
			break;
		case 2:
			height = -50;
			width = (int) ((Math.random() * (201)) - 100);
			System.out.println("(" + height + "," + width + ")");
			break;
		case 3:
			height = (int) ((Math.random() * (101)) - 50);
			width = 100;
			System.out.println("(" + height + "," + width + ")");
			break;

		case 4:
			height = (int) ((Math.random() * (101)) - 50);
			width = -100;
			System.out.println("(" + height + "," + width + ")");
			break;

		}

	}

}
