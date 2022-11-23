package chapters.chapter_05;

public class Quiz_05_35 {

	public static void main(String[] args) {
		double summation = 0;
		for (double i = 1; i < 625; i++) {
			summation += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}
		System.out.print("Summation : " + summation);
	}

}
