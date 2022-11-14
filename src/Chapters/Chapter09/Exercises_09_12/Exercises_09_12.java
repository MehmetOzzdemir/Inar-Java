package Chapters.Chapter09.Exercises_09_12;

import Chapters.Chapter09.Exercises_09_11.LinearEquation;

import java.util.Scanner;

public class Exercises_09_12 {
    public static void main(String[] args) {
        double [][] points =getFromUser();
        double a = points[0][1] - points[1][1];
        double b = -1 * (points[0][0] - points[1][0]);
        double c = points[2][1] - points[3][1];
        double d = -1 * (points[2][0] - points[3][0]);
        double e = a * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = c * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
        LinearEquation values = new LinearEquation(a,b,c,d,e,f);
        display(values);

    }
    public static double [][] getFromUser(){
        Scanner input =new Scanner(System.in);
        double [][]values = new double[4][2];
        System.out.println("Enter The Values (x1,y1),(x2,y2),(x3,y3),(x4,y4) : ");
        for (int i = 0; i < values.length ; i++) {
            for (int j = 0; j <2; j++) {
                values[i][j]=input.nextDouble();
            }

        }
        return values;
    }
    public static void display(LinearEquation point){
        if(point.isSolvable()){
            System.out.println("X : "+point.getX());
            System.out.println("Y : "+point.getY());
        }else{
            System.out.println("The two lines are parallel ");
        }

    }
}
