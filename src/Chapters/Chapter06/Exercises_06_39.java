package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_39 {
    public static void main(String[] args) {
        /*
     * (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)
     * >0 p2 is on the left side of the line
     * =0 p2 is on the same line
     * <0 p2 is on the right side of the line
     */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2:");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        if(leftOfTheLine(x0,y0,x1,y1,x2,y2)){
            System.out.print("(" + x2 + " , " + y2 + ")" + " is on the left side of the line from " + "(" + x0 + ","
                    + y0 + ") to " + "(" + x1 + "," + y1 + ")");
        } else if (onTheSameLine(x0,y0,x1,y1,x2,y2)) {
            System.out.print("(" + x2 + " , " + y2 + ")" + " on the same line from " + "(" + x0 + " , " + y0 + ") to " + "("
                    + x1 + " , " + y1 + ")");
        }else if (onTheLineSegment(x0,y0,x1,y1,x2,y2)) {
            System.out.print("(" + x2 + " , " + y2 + ")" + " on the line segment from " + "(" + x0 + " , " + y0 + ") to " + "("
                    + x1 + " , " + y1 + ")");
        }
        else{
            System.out.print("(" + x2 + " , " + y2 + ")" + " is on the right side of the line from " + "(" + x0 + " , "
                    + y0 + ") to " + "(" + x1 + " , " + y1 + ")");
        }


    }

    public static boolean leftOfTheLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2){
        double check=(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        if(check>0){
            return true;
        }else {
            return false;
        }
    }
    public static boolean onTheSameLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2){
        double check=(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        if(check==0){
            return true;
        }else {
            return false;
        }
    }
    public static boolean onTheLineSegment(double x0, double y0,
                                        double x1, double y1, double x2, double y2){
        double check=(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        if(check==0 && (x2>x0)&& (y2>y0)&& (x2<x1)&& (y2<y1)){
            return true;
        }else {
            return false;
        }
    }
}
