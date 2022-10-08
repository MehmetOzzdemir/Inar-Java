package Weeks.Weeks_09;

import java.util.Arrays;

public class RandomMaxSecondNumber {
    public static void main(String[] args) {
        int [] arr =new int [10];
        fillTheArrWithRandomValues(arr);
        int num=getSecondMaxNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.printf("Second Max Number %d",num);
    }
    public static void findTheSecondMax(){



    }

    private static int getSecondMaxNumber(int[] arr) {
        int max=getMaxNumber(arr);
        int secondMax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(secondMax<arr[i] && arr[i] !=max){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }

    private static int getMaxNumber(int[] arr) {
        int max =-1;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
       return max;
    }

    private static void fillTheArrWithRandomValues(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int random =(int)(Math.random()*100);
            arr[i]=random;
        }
    }
}
