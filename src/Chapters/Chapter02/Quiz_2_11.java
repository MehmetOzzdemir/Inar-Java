package chapters.chapter_02;

import java.util.Scanner;

public class Quiz_2_11 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Numbers Of Years : ");
		int years = input.nextInt();
		int currentPopulation = 312032486;
		int oneDaySecond =24*60*60;
		int birth = (oneDaySecond/7)*360;
		int death= (oneDaySecond/13)*360;
		int immigrant = (oneDaySecond/45)*360;
		int oneYearPopulation = (birth-death)+immigrant;
		System.out.println("Every Year "+oneYearPopulation+ " new People");
		System.out.println(years+" Years Later New Population is "+((oneYearPopulation*years)+currentPopulation));
		
		
		
	}

}
