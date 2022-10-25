package Weeks.Weeks_07;

public class CopyArray {
    public static void main(String[] args) {
        copyArray();
        System.out.println("---------------------");
        variablesCopy();
        System.out.println("---------------------");


    }

    private static void variablesCopy() {
        int [] arr2 = {11,12,13};
        int [] arr1 = {8,9,10};
        for (int i = 0; i <3 ; i++) {
            arr2[i]=arr1[i];
        }

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

        arr2[2]=99;
        System.out.println(arr1[2]);
        System.out.println(arr2[2]);

    }

    private static void copyArray() {
        int [] arr = {1,2,3};
        int [] arr2 = {4,5,6};
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
        System.out.println();
        arr2=arr;
        System.out.println(arr[0]);
        System.out.println(arr2[0]);

        arr2[2]=99;
        System.out.println(arr[2]);
    }
}
