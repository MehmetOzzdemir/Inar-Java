package Weeks.Weeks_10;

import Weeks.Weeks_09.BinarySearch;

import java.util.Scanner;

public class Exercise_07_10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please Enter The Length of The Array : ");
        int l = input.nextInt();

        int [] arr =new int[l];
        //static methods are being invoked through Classes
        Math.random();
        BinarySearch.fillArrWithRandomValues(arr,0,100);
        int indexOfMinValue =indexOfSmallestElement(arr);
        BinarySearch.printArr(arr);
        if(arr.length>0){
            System.out.printf("The minimum value is %d, index of this number is %d",arr[indexOfMinValue],indexOfMinValue);

        }


        //non-static can only be invoked via object
        //String s=new String("");
        //s.length();
        //BinarySearch b= new BinarySearch();
        //b.nonStaticMethod();

        //Student mehmet =new Student();
        //mehmet.changeEmail("mehmetozdemir@inar.com");
    }
    public static int indexOfSmallestElement(int[] array){
        int minIndex = -1;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]<=minVal){
                minIndex=i;
                minVal=array[i];
            }
        }

        return minIndex;
    }
}
