package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_27 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int [] list1 =new int[6];
        int [] list2 =new int[6];
        System.out.print("Enter list1: ");
        for (int i = 0; i < list1.length ; i++) {
            list1[i]=input.nextInt();
        }
        System.out.print("Enter list1: ");
        for (int i = 0; i < list2.length ; i++) {
            list2[i]=input.nextInt();
        }
        if(equals(list1,list2)){
            System.out.println("Two lists are identical");
        }else{
            System.out.println("Two lists are not identical");
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
        sort(list1);
        sort(list2);
        for (int i = 0; i <list1.length ; i++) {
            if(list1[i]!=list2[i]){
                return false;
            }
        }
        return true;

    }
    public static void sort(int [] list){
        int min;
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i+1; j < list.length ; j++) {//10 15 20 5 25
                if(list[i]>list[j]){
                    min=list[j];//5
                    list[j]=list[i];//10
                    list[i]=min;//5
                }
            }
        }
    }
}

