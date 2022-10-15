package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_36 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter The Number Of Sides : ");
        int n =input.nextInt();
        System.out.print("Enter The Side : ");
        double side =input.nextDouble();
        System.out.print("The Area Of The Polygon is "+area(n,side));
    }
    public static double area(int n, double side){
        double area=(n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
        return area;
    }
}
