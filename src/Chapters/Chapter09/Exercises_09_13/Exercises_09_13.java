package Chapters.Chapter09.Exercises_09_13;

import java.util.Scanner;

public class Exercises_09_13 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double [][] matrix=getFomUser(input);
        Location location=locateLargest(matrix);
        System.out.println(location.toString());
    }
    public static Location locateLargest(double[][] a){
        int row=-1;
        int col=-1;
        double maxValue=Double.MIN_VALUE;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if(a[i][j]>maxValue){
                    row=i;
                    col=j;
                    maxValue=a[i][j];
                }
            }
        }
        return new Location(row,col,maxValue);
    }
    public static double[][] getFomUser(Scanner input) {
        System.out.print("Enter the number of rows and columns in the array: ");
        int row=input.nextInt();
        int col=input.nextInt() ;
        System.out.println("Enter The Array : ");
        double [][] a=new double[row][col];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j]=input.nextDouble();
            }
        }
        return a;
    }
}
