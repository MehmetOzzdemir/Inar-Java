package Chapters.Chapter07;

import Weeks.Weeks_12.Student;

import java.util.Scanner;

public class Exercises_07_17 {
    public static void main(String[] args) {
        /*
        (Sort students) Write a program that prompts the user to enter the number of students,
        the students’ names, and their scores,
        and prints student names in decreasing order of their scores.
         */

        Scanner input =new Scanner(System.in);
        System.out.print("Enter Student Number : ");
        int student = input.nextInt();
        System.out.println("------------------------------------");
        String [] studentName= new String[student];
        double [] score = new double[student];

        for (int i = 0; i <studentName.length ; i++) {
            System.out.print("Student "+(i+1)+" :  ");
            studentName[i]=input.next();
            System.out.print("Student "+(i+1)+" Score :  ");
            score[i]=input.nextDouble();
        }
        System.out.println("------------------------------------");
        for (int i = 0; i <student ; i++) {
            selectionSort(score,studentName);

        }
        for (int i = 0; i <student ; i++) {
            System.out.println("Student "+(i+1)+" :  "+studentName[i]);
            System.out.println("Student "+(i+1)+" Score :  "+score[i]);
            System.out.println("------------------------------------");
        }

    }
    public static void selectionSort(double [] arr,String[]arr1){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    swapScore(arr,i,j);
                    swapName(arr1,i,j);
                }
            }
        }
    }
    public static void swapScore(double []arr,int i,int j){
        double temp =arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static void swapName(String []arr,int i,int j){
        String temp =arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
