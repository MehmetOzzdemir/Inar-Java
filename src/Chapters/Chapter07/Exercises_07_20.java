package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_20 {
    public static void main(String[] args) {
    /*
        (Revise selection sort) In Section 7.11, you used selection sort to sort an array.
        The selection-sort method repeatedly finds the smallest number in the current
        array and swaps it with the first. Rewrite this program by finding the largest number
        and swapping it with the last. Write a test program that reads in ten double
        numbers, invokes the method, and displays the sorted numbers.
     */
        Scanner input = new Scanner(System.in);
        double [] numbers =new double[10];
        System.out.print("Enter The Numbers : ");

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=input.nextDouble();
        }
        selectionSortLargest(numbers);
        for (double e:numbers
             ) {
            System.out.print(e+" ");

        }
    }
    public static void selectionSortLargest(double []arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]<arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
    public static void swap (double [] arr,int  i, int j){
        double temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
