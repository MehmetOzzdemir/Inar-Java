package Chapters.Chapter11.VolkanHocaExercises.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLisstMethod {
    public static void main(String[] args) {
        String [] array ={"red","green","blue"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(array));
        System.out.println(list);

        String [] arr1=new String[list.size()];
        list.toArray(arr1);

        for (int i = 0; i <arr1.length ; i++) {
            System.out.print((arr1[i])+" ");
        }
        System.out.println();


        Integer[] arr = {3,5,95,4,15,34,3,6,5};
        java.util.Arrays.sort(arr);

        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(arr));
        java.util.Collections.sort(list1);
        System.out.println(list1);
        java.util.Collections.shuffle(list1);
        System.out.println(list1);
        java.util.Collections.sort(list1);
        System.out.println(list1);
    }
}
