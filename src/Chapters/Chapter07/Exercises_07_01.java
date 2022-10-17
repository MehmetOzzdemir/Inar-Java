package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_01 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter Number of Student : ");
        int num=input.nextInt();
        int [] students = new int[num];

        System.out.print("Enter "+num+" Scores : " );
        int best =Integer.MIN_VALUE;
        String grade =null;


        best = bestStudent(input, num, students, best);
        grade(num, students, best);
        System.out.println(best);
    }
    public static void grade(int num, int[] students, int best) {
        String grade;
        for (int i = 0; i < num; i++) {
            if(students[i]>=(best -10)){
                grade="A";
            }
            else if(students[i]>=(best -20)){
                grade="B";
            }else if(students[i]>=(best -30)){
                grade="C";
            }else if(students[i]>=(best -40)){
                grade="D";
            }else{
                grade="F";
            }
            printArr(students, grade, i);
        }
    }
    public static void printArr(int[] students, String grade, int i) {
        System.out.println(i +1 +" . Student's Score is "+ students[i]+" and grade is "+ grade);
    }
    public static int bestStudent(Scanner input, int num, int[] students, int best) {
        for (int i = 0; i < num; i++) {
            int score = input.nextInt();
            students[i]=score;
            if(score> best){
                best =score;
            }
        }
        return best;
    }
}
