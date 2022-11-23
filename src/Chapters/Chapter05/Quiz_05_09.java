package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter The Student Number : ");
		int studentNumber = input.nextInt();
		String student1="";
		String student2="";
		double score1=0;
		double score2=0;
		
		for (int i=0;i<studentNumber;i++) {
			System.out.print((i+1)+". Student Name : ");
			String student=input.next();
			System.out.print("Enter The Score : ");
			double score=input.nextDouble();
			if(i==0) {
				score1=score;
				student1=student;
			}else if(i==1 && score >score1) {
				score2=score1;
				student2=student1;
				score1=score;
				student1=student;
			}else if (i==1) {
				score2=score;
				student2=student;
			}else if(i>1 && score>score1 && score>score2) {
				score2=score1;
				score1=score;
				student2=student1;
				student1=student;
			}else if(i>1 && score>score2) {
				score2=score;
				student2=student;
			}
			
		}
		System.out.println("High Score Student Name is "+student1+" and Student's Score is "+score1);
		System.out.println("Secon High Score Student Name is "+student2+" and Student's Score is "+score2);


	}

}
