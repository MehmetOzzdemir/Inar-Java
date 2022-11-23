package chapters.chapter_05;

public class Quiz_05_12 {

	public static void main(String[] args) {
		int number = 0;

        while (Math.pow(number, 2) < 12000) {
            number++;
        }
        System.out.println(number + " is the lowest number, such that n^2 is greater than 12,000");
        System.out.println("Answer: " + (number - 1) + "^2 = " +(int) Math.pow(number - 1, 2));
        System.out.println("Answer: "+ number + "^2 = " +(int) Math.pow(number, 2));
	}

}
