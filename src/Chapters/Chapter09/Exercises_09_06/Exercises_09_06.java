package Chapters.Chapter09.Exercises_09_06;

import Weeks.Weeks_09.SelectionSort;

public class Exercises_09_06 {
    public static void main(String[] args) {
        int []arr=createAndFillArray();
        durationOfSelectionSort(arr);
    }
    public static void durationOfSelectionSort(int [] arr){
        StopWatch sort =new StopWatch();
        sort.start();
        SelectionSort.selectionSort(arr);
        sort.stop();
        System.out.println("Selection Sort takes "+sort.elapsedTime()+" milliseconds");
    }
    public static int [] createAndFillArray(){
        int [] arr=new int[10_000];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(int)(Math.random()*Integer.MAX_VALUE);
        }
        return arr;
    }

}
