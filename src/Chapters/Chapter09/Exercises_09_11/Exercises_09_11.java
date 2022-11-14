package Chapters.Chapter09.Exercises_09_11;

import java.util.Scanner;

public class Exercises_09_11 {
    public static void main(String[] args) {
        double [] values = getFromUser();
        LinearEquation q1=new LinearEquation(values[0],values[1],values[2],values[3],values[4],values[5] );
        display(q1);
        System.out.println();
        q1.setA(8);
        display(q1);

    }
    public static double[] getFromUser(){
        Scanner input =new Scanner(System.in);
        double [] values=new double[6];
        System.out.println("Enter Values For a,b,c,d,e,f :");
        for (int i = 0; i <values.length ; i++) {
            values[i]=input.nextDouble();
        }
        return values;
    }
    public static void display(LinearEquation q1){
        if(q1.isSolvable()){
            System.out.println("For Equation X is "+q1.getX());
            System.out.println("For Equation Y is "+q1.getY());
        }else{
            System.out.println("The Equation Has NO ROOT !!!");
        }

    }
}
