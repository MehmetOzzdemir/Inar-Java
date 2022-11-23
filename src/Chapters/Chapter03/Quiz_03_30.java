package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long allMilliSecond = System.currentTimeMillis();

		// System.out.println("All Milli Second : " + allMilliSecond);

		long totalSecond = allMilliSecond / 1000;

		// System.out.println("All Second : " + totalSecond);

		long currentSecond = totalSecond % 60;

		// System.out.println("Current Second :" + currentSecond);

		long totalMinutes = totalSecond / 60;

		// System.out.println("Current Minutes :" + totalMinutes);

		long currentMinute = totalMinutes % 60;

		// System.out.println("Current Minutes :" + currentMinute);

		long totalHour = totalMinutes / 60;

		// System.out.println("All Hour :" + totalHour);

		long currentHour = totalHour % 24;
		
		System.out.print("Enter the time zone offset to GMT:");
		int timeZone =input.nextInt();
		currentHour =(currentHour+timeZone)%24;
	
		if (currentHour<12 ) {
			System.out.println("Current Time  :" + currentHour + ":" + currentMinute + ":" + currentSecond + " AM");
		}else {
			currentHour%=12;
			System.out.println("Current Time  :" + currentHour + ":" + currentMinute + ":" + currentSecond + " PM");
		
	}}

}
