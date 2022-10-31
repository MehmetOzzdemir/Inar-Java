package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_18 {
    public static void main(String[] args) {
    /*  (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubblesort
        algorithm makes several passes through the array. On each pass, successive
         neighboring pairs are compared. If a pair is not in order, its values are swapped;
        otherwise, the values remain unchanged. The technique is called a bubble sort or
        sinking sort because the smaller values gradually “bubble” their way to the top
        and the larger values “sink” to the bottom. Write a test program that reads in ten
        double numbers, invokes the method, and displays the sorted numbers.
     */
        Scanner input = new Scanner(System.in);
        double [] numbers =new double[10];

        System.out.println("Enter Ten Numbers : ");
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=input.nextDouble();
        }
        bubbleSort(numbers);
        for (double e:numbers
             ) {
            System.out.println(e+" ");

        }
        System.out.println();
    }

    public static void bubbleSort(double[]arr){
        double temp;
        boolean swap;

        do {
            swap=false;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                swap=true;
            }
        }
    }while (swap);

        }
}
