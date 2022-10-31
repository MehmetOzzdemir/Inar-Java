package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_19 {
    public static void main(String[] args) {
        /*
        (Sorted?) Write the following method that returns true if the list is already sorted
        in increasing order.
        public static boolean isSorted(int[] list)
        Write a test program that prompts the user to enter a list and displays whether
        the list is sorted or not. Here is a sample run. Note that the first number in the
           input indicates the number of the elements in the list. This number is not part
        of the list.
         */
        Scanner input =new Scanner (System.in);
        System.out.print("Enter The List : ");

        int [] numbers=new int[10];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=input.nextInt();
        }
        if(isSorted(numbers)==true){
            System.out.println("The list is sorted");
                    }
        else {
            System.out.println("The list is not sorted");
        }

    }
    public static boolean isSorted(int[] list){
        for (int i = 0; i < list.length-1 ; i++) {
            if(list[i]>list[i+1]){
                return false;
            }
        }
        return true;
    }
}
