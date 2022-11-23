package chapters.chapter_05;

public class Quiz_05_11 {

	public static void main(String[] args) {
		int colum = 10;
		int count = 0;
		for (int i = 100; i < 201; i++) {
			if (i % 6 == 0 ^ i % 5 == 0) {
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
