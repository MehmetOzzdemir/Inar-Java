package Chapters.Chapter11.Exercises_11_01;

import java.util.Scanner;

public class Exercises_11_01 {
    public static void main(String[] args) {
        Triangle t1=getATriangleFromUser();
        System.out.println("Area : "+t1.getArea()+"\nPerimeter : "+t1.getPerimeter()+"\nColor : "+t1.getColor()+"\nisFilled : "+t1.isFilled()
                            +"\nCreate Date : "+t1.getDateCreated());
    }

    private static Triangle getATriangleFromUser() {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter three sides for a triangle :");
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();

        System.out.println("Enter The Color Of Triangle :");
        String color =input.next();
        System.out.println("Enter whether the triangle is filled(true/false): ");
        boolean isFilled = input.nextBoolean();

        Triangle t1=new Triangle(side1,side2,side3);
        t1.setColor(color);
        t1.setFilled(isFilled);
        return t1;
    }
}
