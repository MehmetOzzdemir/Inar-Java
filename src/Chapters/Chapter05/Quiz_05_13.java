package chapters.chapter_05;

public class Quiz_05_13 {

	public static void main(String[] args) {
		int number = 0;

        while (Math.pow(number, 3) < 12000) {
            number++;
        }
        System.out.println(number-1 + " is the lowest number, such that n^2 is greater than 12,000");
        System.out.println("Answer: "+ number + "^3 = " +(int) Math.pow(number, 3));
        System.out.println("Answer: " + (number - 1) + "^3 = " +(int) Math.pow(number - 1, 3));
        
	
	}

}
