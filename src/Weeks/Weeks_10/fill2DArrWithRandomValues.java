package Weeks.Weeks_10;

import java.util.Scanner;

public class fill2DArrWithRandomValues {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows =input.nextInt();
        System.out.println("Enter the Columbs of rows");
        int columns =input.nextInt();
        int [][]arr =new int[rows][columns];
        fill2DArrWithRandomValues(arr,10,20);
    }
    public static void fill2DArrWithRandomValues(int [][]arr,int start,int limit){
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length ; column++) {
                arr[row][column]= (int)((Math.random()*(limit-start))+start);
            }
        }
    }
}
