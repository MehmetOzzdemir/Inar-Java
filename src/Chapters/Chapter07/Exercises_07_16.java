package Chapters.Chapter07;

import Chapters.Chapter07.VolkanExercises.LinearSearch;
import Chapters.Chapter07.VolkanExercises.SelectionSort;
import Weeks.Weeks_09.BinarySearch;

public class Exercises_07_16 {
    public static void main(String[] args) {

        int num;
        int [] numbers =new int[100_000];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=getRandom();
        }
        int key =getRandom();
        System.out.println(key);

        double searchResult;
        long startTime=System.currentTimeMillis();
        searchResult= linearSearch(numbers,key);
        long endTime=System.currentTimeMillis();
        long executionTime = (endTime - startTime);
        System.out.println("Linear Search Time : "+executionTime);
        System.out.println();


        SelectionSort.selectionSort(numbers);


        startTime=System.currentTimeMillis();
        searchResult=binarySearch(numbers,key);
        System.out.println(searchResult);
        endTime=System.currentTimeMillis();
        executionTime = (endTime - startTime);
        System.out.println("Binary Search Time : "+executionTime);
        System.out.println();



    }

    private static int getRandom() {
        int randomNumber = 1+(int) (Math.random()*100_000);
        return randomNumber;
    }
    public static double linearSearch(int [] numbers,int key){
        for (int i = 0; i < numbers.length ;  i++) {
            if(key == numbers[i]){
                return i;
            }
        }
        return -1;

    }
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < mid)
                high = mid - 1;
            else if (key == mid)
                return mid;
            else
                low = mid + 1;
        }
        return -low -1;
    }

}
