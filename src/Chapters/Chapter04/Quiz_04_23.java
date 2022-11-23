package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name : ");
		String employee = input.nextLine();
		System.out.print("Enter Number Of Hours Worked In A Week : ");
		double workedHours = input.nextDouble();
		System.out.print("Enter Hourly Pay Rate : ");
		double payRate = input.nextDouble();
		System.out.print("Enter Federal Tax Withholding Rate : ");
		double federalRate = input.nextDouble();
		System.out.print("Enter State Tax Withholding Rate : ");
		double stateRate = input.nextDouble();
		double grossPay = payRate * workedHours;
		double federalWithholding = grossPay * federalRate;
		double stateWithholding = grossPay * stateRate;
		double total = federalWithholding + stateWithholding;

		System.out.println();
		System.out.print("Employee Name : " + employee + "\n");
		System.out.print("Hours Worked : " + workedHours + "\n");
		System.out.print("Hourly Pay Rate : $" + payRate + "\n");
		System.out.print("Gross Pay : $" + grossPay + "\n");
		System.out.println("Deductions : ");
		System.out.println("\tFederal Withholding (" + (federalRate * 100) + "%) : $" + federalWithholding);
		System.out.println("\tState Withholding (" + (stateRate * 100) + "%) : $" + stateWithholding);
		System.out.println("\tTotal Deduction : $" + total);
		System.out.println("Net Pay : $"+(grossPay-total));
	}

}
