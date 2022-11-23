package chapters.chapter_02;

public class Quiz_2_08 {

	public static void main(String[] args) {
		long allMilliSecond = System.currentTimeMillis();

		System.out.println("All Milli Second : " + allMilliSecond);

		long totalSecond = allMilliSecond / 1000;

		System.out.println("All Second : " + totalSecond);

		long currentSecond = totalSecond % 60;

		System.out.println("Current Second :" + currentSecond);

		long totalMinutes = totalSecond / 60;

		System.out.println("Current Minutes :" + totalMinutes);

		long currentMinute = totalMinutes % 60;

		System.out.println("Current Minutes :" + currentMinute);

		long totalHour = totalMinutes / 60;

		System.out.println("All Hour :" + totalHour);

		long currentHour = totalHour % 24;

		System.out.println("Current Hour : " + (currentHour + 3));

		System.out.println("Current Time  :" + (currentHour + 3) + ":" + currentMinute + ":" + currentSecond + " TR");

	}

}
