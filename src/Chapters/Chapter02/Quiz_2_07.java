package chapters.chapter_02;
import java.util.Scanner;
public class Quiz_2_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Please Write Minute : ");
		int minutes=input.nextInt();
		int hours = minutes/60;
		int days=hours/24;
		int years=days/365;
		days=days%365;
		System.out.print(minutes+" Minutes : "+years+" Years "+ days+" Days");
		
	}

}
