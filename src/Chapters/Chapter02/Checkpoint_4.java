package chapters.chapter_02;

public class Checkpoint_4 {

	public static void main(String[] args) {
		//2.14 Solution
		System.out.println(2 * (5 / 2 + 5 / 2));
		System.out.println(2 * 5 / 2 + 2 * 5 / 2);
		System.out.println(2 * (5 / 2));
		System.out.println(2 * 5 / 2);
		
		//2.15 Solution
		System.out.println("25 / 4 is " + 25 / 4);	//incorrect
		System.out.println("25 / 4.0 is " + 25 / 4.0);//Correct
		System.out.println("3 * 2 / 4 is " + 3 * 2 / 4); //incorrect
		System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4); // correct
	}

}
