package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_26 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int [] lis1 =new int[6];
        int [] lis2 =new int[6];
        System.out.print("Enter list1: ");
        for (int i = 0; i < lis1.length ; i++) {
            lis1[i]=input.nextInt();
        }
        System.out.print("Enter list1: ");
        for (int i = 0; i < lis2.length ; i++) {
            lis2[i]=input.nextInt();
        }
      if(equals(lis1,lis2)){
          System.out.println("Two lists are strictly identical");
      }else{
          System.out.println("Two lists are not strictly identical");
      }


    }
    public static void printLists(int []list1){
        for (int i = 0; i < list1.length ; i++) {
            System.out.print(list1[i]+" ");
        }
    }
    public static boolean equals(int[] list1, int[] list2){
        if(list1.length!= list2.length){
            return false;
        }
            for (int i = 0; i <list1.length ; i++) {
                if(list1[i]!=list2[i]){
                    return false;
                }
            }
            return true;

    }
}
