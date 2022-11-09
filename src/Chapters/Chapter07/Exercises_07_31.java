package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_31 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter List 1 : ");
        //int number1=input.nextInt();
        int [] list1=new int[6];
        for (int i = 0; i < list1.length ; i++) {
            list1[i]=input.nextInt();
        }
        System.out.print("Enter List 2 : ");
        //int number2 = input.nextInt();
        int [] list2 =new int[4];
        for (int i = 0; i < list2.length ; i++) {
            list2[i]=input.nextInt();
        }
        int [] list3=merge(list1,list2);

        System.out.print("The Merged List is ");
        for (int e :list3
             ) {
            System.out.print(e+" ");
        }
    }
    public static int[] merge(int[] list1, int[] list2){
        int merge=list1.length+list2.length;
        int list3[]=new int[merge];
        for (int i = 0; i < list1.length ; i++) {
            list3[i]=list1[i];
        }
        int count =0;
        for (int i = list1.length; i <merge ; i++) {
            list3[i]=list2[count];
            count++;
        }
        sort(list3);

        return list3;
    }
    public static void sort(int [] list){
        int temp =0;
        for (int i = 0; i < list.length ; i++) {
            for (int j = i+1; j < list.length ; j++) {
                if(list[i]>list[j]){
                    swap(list,i,j);
                }
            }
        }
    }

    private static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i]=list[j];
        list[j]=temp;

    }
}
