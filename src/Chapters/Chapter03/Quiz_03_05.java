package chapters.chapter_03;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Quiz_03_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Today's day : ");
		int today = input.nextInt();
		System.out.print("Enter the number of days since today : ");
		int futureDay = input.nextInt();
		int future = (today + futureDay) % 7;
		String day_of_week = " ";

		switch (today) {
		case 0:
			day_of_week = "Sunday";
			break;
		case 1:
			day_of_week = "Monday";
			break;
		case 2:
			day_of_week = "Tuesday";
			break;
		case 3:
			day_of_week = "Wednesday";
			break;
		case 4:
			day_of_week = "Thursday";
			break;
		case 5:
			day_of_week = "Friday";
			break;
		case 6:
			day_of_week = "Saturday";
			break;
			
		}
		if (future == 0) {
			System.out.printf("Todays is "+ day_of_week +" and the future day is Sunday", 0);
		} else if (future == 1) {
			System.out.printf("Todays is "+ day_of_week +" and the future day is Monday", 1);
		} else if (future == 2) {
			System.out.printf("Todays is "+day_of_week+" and the future day is Tuesday", 2);
		} else if (future == 3) {
			System.out.printf("Todays is "+day_of_week+" and the future day is Wednesday", 3);
		} else if (future == 4) {
			System.out.printf("Todays is "+day_of_week+" and the future day is Thursday", 4);
		} else if (future == 5) {
			System.out.printf("Todays is "+day_of_week+ " and the future day is Friday", 5);
		} else if (future == 6) {
			System.out.printf("Todays is "+day_of_week+" and the future day is Saturday", 6);
		}
	}

}