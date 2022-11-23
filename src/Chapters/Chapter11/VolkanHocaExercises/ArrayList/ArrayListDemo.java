package Chapters.Chapter11.VolkanHocaExercises.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int count =0;
        for (int i = 0; i <1_000_000 ; i++) {
            list.add((int)(Math.random()*100)+"");
            System.out.print(list.get(i)+" ");
            count++;
            if (count%10==0){
                System.out.println();
            }
        }
        list.clear();
        System.out.println(list);
    }
}
