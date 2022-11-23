package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Your Gain For Annually : ");
		double gain = input.nextDouble();
		double tax;
		System.out.print("(0-single filter, 1-married jointly or " +
					"qualifying widow(er), 2-married separately, 3-head of " +
				"houshold) Enter the filing status:");
		int status = input.nextInt();
		switch (status) {
		case 0:

			if (gain <= 8350) {
				tax = gain * 0.1;
				System.out.print("Tax Rate %10 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain <= 33950) {
				tax = (8350 * 0.10) + (gain - 8350) * 0.15;
				System.out.print("Tax Rate %15 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain <= 82250) {
				tax = (8350 * 0.10) + (33950- 8350) * 0.15 + (gain - 33950) * 0.25;
				System.out.print("Tax Rate %25 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain <= 171550) {
				tax = (8350 * 0.1) + (33950- 8350) * 0.15 + (82250 - 33950) * 0.25 + (gain - 82250) * 0.28;
				System.out.print("Tax Rate %28 and Your Tax : " + (int) (tax * 100) / 100.0);
			} else if (gain <= 372950) {
				tax = (8350 * 0.1) + (33950- 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (gain - 171550) * 0.33;
				System.out.print("Tax Rate %33 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain > 372950) {
				tax = (8350 * 0.1) + (33950- 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (372950 - 171550) * 0.33+ (gain - 372950) * 0.4;
				System.out.print("Tax Rate %40 and Your Tax : " + (int) (tax * 100) / 100.0);
			}
			break;
		case 1:

			if (gain <= 16700) {
				tax = gain * 0.1;
				System.out.print("Tax Rate %10 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain <= 67900) {
				tax = (16700 * 0.10) + (gain - 16700) * 0.15;
				System.out.print("Tax Rate %15 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain <= 137050) {
				tax = (16700 * 0.10) + (67900- 16700) * 0.15 + (gain - 67900) * 0.25;
				System.out.print("Tax Rate %25 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain <= 208850) {
				tax = (16700 * 0.1) + (67900- 16700) * 0.15 + (137050 - 67900) * 0.25 + (gain - 137050) * 0.28;
				System.out.print("Tax Rate %28 and Your Tax : " + (int) (tax * 100) / 100.0);
			} else if (gain <= 372950) {
				tax = (16700 * 0.1) + (67900- 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
						+ (gain - 208850) * 0.33;
				System.out.print("Tax Rate %33 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain > 372950) {
				tax = (16700 * 0.1) + (67900- 16700) * 0.15 + (82250 - 67900) * 0.25 + (208850 - 137050) * 0.28
						+ (372950 - 208850) * 0.33+ (gain - 372950) * 0.4;
				System.out.print("Tax Rate %40 and Your Tax : " + (int) (tax * 100) / 100.0);
			}
			break;
		case 2:

			if (gain <= 8350) {
				tax = gain * 0.1;
				System.out.print("Tax Rate %10 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain <= 33950) {
				tax = (8350 * 0.10) + (gain - 8350) * 0.15;
				System.out.print("Tax Rate %15 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain <= 68525) {
				tax = (8350 * 0.10) + (33950- 8350) * 0.15 + (gain - 33950) * 0.25;
				System.out.print("Tax Rate %25 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain <= 104425) {
				tax = (8350 * 0.1) + (33950- 8350) * 0.15 + (68525 - 33950) * 0.25 + (gain - 68525) * 0.28;
				System.out.print("Tax Rate %28 and Your Tax : " + (int) (tax * 100) / 100.0);
			} else if (gain <= 186475) {
				tax = (8350 * 0.1) + (33950- 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (gain - 104425) * 0.33;
				System.out.print("Tax Rate %33 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain > 186475) {
				tax = (8350 * 0.1) + (33950- 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (186475 - 104425) * 0.33+ (gain - 186475) * 0.4;
				System.out.print("Tax Rate %40 and Your Tax : " + (int) (tax * 100) / 100.0);
			}
			break;
		case 3:
			if (gain <= 11950) {
				tax = gain * 0.1;
				System.out.print("Tax Rate %10 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain <= 45500) {
				tax = (11950 * 0.10) + (gain - 11950) * 0.15;
				System.out.print("Tax Rate %15 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain <= 117450) {
				tax = (11950 * 0.10) + (45500- 11950) * 0.15 + (gain - 45500) * 0.25;
				System.out.print("Tax Rate %25 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain <= 190200) {
				tax = (11950 * 0.1) + (45500- 11950) * 0.15 + (117450 - 45500) * 0.25 + (gain - 190200) * 0.28;
				System.out.print("Tax Rate %28 and Your Tax : " + (int) (tax * 100) / 100.0);
			} else if (gain <= 372950) {
				tax = (11950 * 0.1) + (45500- 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
						+ (gain - 190200) * 0.33;
				System.out.print("Tax Rate %33 and Your Tax : " + (int) (tax * 100) / 100.0);

			} else if (gain > 372950) {
				tax = (11950 * 0.1) + (45500- 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
						+ (372950 - 190200) * 0.33+ (gain - 372950) * 0.4;
				System.out.print("Tax Rate %40 and Your Tax : " + (int) (tax * 100) / 100.0);
			}
			break;

		}
	}

}
