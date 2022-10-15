package Weeks.Weeks_10;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("Please Enter The Row And Columnn For The Matrix : ");
        int row=input.nextInt();
        int column =input.nextInt();
        int [][] arr1 =new int[row][column] ;
        int [][] arr2 =new int[row][column] ;
      /*  System.out.println("Please Enter The First Matrix Values");
        initiate2Arr(arr1,input);
        System.out.println("Please Enter The Second Matrix Values");
        initiate2Arr(arr2,input);*/
        TwoDimensionalArray.fill2DArrWithRandomValues(arr1,0,10);
        TwoDimensionalArray.fill2DArrWithRandomValues(arr2,0,10);
        int [][] result = new int[row][column];
        sumTwoMatrix(arr1,arr2,result);
        TwoDimensionalArray.printArr(arr1);
        TwoDimensionalArray.printArr(arr2);
        TwoDimensionalArray.printArr(result);
    }

    public static void sumTwoMatrix(int[][] arr1, int[][] arr2, int[][] result) {
        for (int row = 0; row <result.length ; row++) {
            for (int column = 0; column <result[row].length ; column++) {
                result[row][column]=arr1[row][column]+arr2[row][column];
            }
        }
    }

    public static void initiate2Arr(int[][] arr,Scanner input) {
        for (int row = 0; row < arr.length ; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] =input.nextInt();
            }

        }
    }
}
