package Chapters.Chapter07;

public class Exercises_07_15 {
    public static void main(String[] args) {
        /*(Eliminate duplicates) Write a method that returns a new array by eliminating the
        duplicate values in the array using the following method header:
        public static int[] eliminateDuplicates(int[] list)
        Write a test program that reads in ten integers, invokes the method, and displays
        the result. Here is the sample run of the program:

         */
        int []arr =new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(int)((Math.random()*10)+1);
            System.out.print(arr[i]+  " ");
        }
        System.out.println();
        System.out.print("The distinct numbers are:");
        for (int e: eliminateDuplicates(arr)) {
            if (e > 0)
                System.out.print(" " + e);
        }

        System.out.println();
    }
    public static int[] eliminateDuplicates(int[] list){
        int count=0;
        int[] arr1 = new int [list.length];
        for (int e :list
            ) {
            if(linearSearch(arr1,e)==-1){
                arr1[count]=e;
                count++;
            }

        }
        return arr1;
    }
    public static int linearSearch(int []arr,int key){
        for (int i = 0; i <arr.length ; i++) {
            if(key==arr[i]){
                return key;
            }
        }
        return -1;
    }
}
