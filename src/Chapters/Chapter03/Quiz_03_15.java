package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_15 {

	public static void main(String[] args) {

		System.out.print("Please enter a three digit number:");
		Scanner input = new Scanner(System.in);

		int myNumber = input.nextInt();
		// 0 inlcuded - r excluded => random double

		int lottery = (int) (Math.random() * 900 + 100);
		System.out.print("Please enter lottery:");
		lottery = input.nextInt();

		int l_yuzler = lottery / 100;
		// 817 % 100 = 17 / 10 = 1
		int l_onlar = (lottery % 100) / 10;
		// 817 % 100 = 17 % 10 =7
		int l_birler = (lottery % 100) % 10;

		int m_yuzler = myNumber / 100;
		// 817 % 100 = 17 / 10 = 1
		int m_onlar = (myNumber % 100) / 10;
		// 817 % 100 = 17 % 10 =7
		int m_birler = (myNumber % 100) % 10;

		// lottery 711
		// my 817

		if (lottery == myNumber) {
			System.out.println("Congrats!!! you won 10,000 $");
		} else if (((l_birler == m_birler) || (l_birler == m_onlar) || (l_birler == m_yuzler))
				&& ((l_onlar == m_birler) || (l_onlar == m_onlar) || (l_onlar == m_yuzler))
				&& ((l_yuzler == m_birler) || (l_yuzler == m_onlar) || (l_yuzler == m_yuzler))
				&& ((l_yuzler + l_onlar + l_birler) == (m_yuzler + m_onlar + m_birler))) {
			// f f f
			System.out.println("Congrats!!! you won 3,000 $");
		} else if (((l_birler == m_birler) || (l_birler == m_onlar) || (l_birler == m_yuzler))
				|| ((l_onlar == m_birler) || (l_onlar == m_onlar) || (l_onlar == m_yuzler))
				|| ((l_yuzler == m_birler) || (l_yuzler == m_onlar) || (l_yuzler == m_yuzler))) {
			System.out.println("Congrats!!! you won 1,000 $");
		} else {
			System.out.println("Sorry, No Luck!");
		}

		System.out.println("Lottery :" + lottery);
		System.out.println("myNumber :" + myNumber);

	}

}
