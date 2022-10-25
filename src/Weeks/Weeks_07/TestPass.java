package Weeks.Weeks_07;

public class TestPass {
    public static void main(String[] args) {
        int [] arr ={1,2};

        System.out.println("Before Invoking Swap");
        System.out.println("Array is {"+arr[0]+","+arr[1]+"}");
        swap(arr[0],arr[1]);
        System.out.println("After Invoking Swap");
        System.out.println("Array is {"+arr[0]+","+arr[1]+"}");

        System.out.println("----------------------------------");

        System.out.println("Before Invoking swapFirstTwoArray");
        System.out.println("Array is {"+arr[0]+","+arr[1]+"}");
        swapFirstTwoArray(arr);
        System.out.println("After Invoking swapFirstTwoArray");
        System.out.println("rray is {"+arr[0]+","+arr[1]+"}");
    }

    private static void swapFirstTwoArray(int[] arr) {
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
    }

    private static void swap(int i1, int i2) {
        int temp=i1;
        i1=i2;
        i2=temp;
    }
}
