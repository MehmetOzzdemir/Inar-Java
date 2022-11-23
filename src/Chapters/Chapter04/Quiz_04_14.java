package chapters.chapter_04;

import java.util.Scanner;

public class Quiz_04_14 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter A Letter Grade : ");
		String grade=input.next().toUpperCase();
		if(grade.equals("A")) {
			System.out.println("The numeric value for grade "+ grade+" is "+4);
		}else if(grade.equals("B")) {
			System.out.println("The numeric value for grade "+ grade+" is "+3);
		}else if(grade.equals("C")) {
			System.out.println("The numeric value for grade "+ grade+" is "+2);
		}else if(grade.equals("D")) {
			System.out.println("The numeric value for grade "+ grade+" is "+1);
		}else if(grade.equals("F")) {
			System.out.println("The numeric value for grade "+ grade+" is "+0);
		}else {
			System.out.print(grade +" is an invalid grade");
		}
	}

}
