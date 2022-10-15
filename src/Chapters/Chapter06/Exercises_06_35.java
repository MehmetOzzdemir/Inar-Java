package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_35 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter The Side : ");
        double side = input.nextDouble();
        System.out.print("The Area of Pentagon is "+area(side));
    }
    public static double area(double side){
        double area=(5*Math.pow(side,2))/(4*Math.tan(Math.PI/5));
        return area;
    }
}
