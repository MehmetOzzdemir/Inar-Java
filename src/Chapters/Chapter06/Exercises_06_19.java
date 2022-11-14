package Chapters.Chapter06;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercises_06_19 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Three Side : ");
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();

        if(isValid(side1,side2,side3)){
            System.out.println("The area of The Rectangle : "+area(side1,side2,side3));
        }else{
            System.out.println("Invalid Value");
        }
    }
    public static boolean isValid(double side1,double side2,double side3){
        boolean valid= (side1+side2>side3) && (side1+side3>side2)&&(side3+side2>side1);
        return valid;
    }
    public static double area(double side1,double side2,double side3){
        double a = (side1+side2+side3)/2;
        double area = Math.sqrt(a*(a-side1)*(a-side2)*(a-side3));
        return area;
    }
}
