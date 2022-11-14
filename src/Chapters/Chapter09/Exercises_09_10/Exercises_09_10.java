package Chapters.Chapter09.Exercises_09_10;

import java.util.Scanner;

public class Exercises_09_10 {
    public static void main(String[] args) {
        double [] values =getFromUser();

        QuadraticEquation q1=new QuadraticEquation(values[0],values[1],values[2] );
        display(q1);
    }
    public static double [] getFromUser(){
        Scanner input = new Scanner(System.in);
        double [] values =new double[3];
        System.out.print("Enter The Values a,b,c :");
        for (int i = 0; i < values.length ; i++) {
            values[i]=input.nextDouble();
        }
        return values;
    }
    public static void display(QuadraticEquation q1){
        if(q1.getDiscriminant()<0){
            System.out.println("The Equation has No Root");
        }else if(q1.getDiscriminant()==0){
            System.out.println("The Equation Has A Root : "+q1.getRoot1());
        }else{
            System.out.println("The Equation Has Two Roots "+q1.getRoot1()+" and "+q1.getRoot2());
        }
    }
}
