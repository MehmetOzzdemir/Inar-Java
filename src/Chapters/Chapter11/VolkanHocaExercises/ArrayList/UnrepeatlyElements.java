package Chapters.Chapter11.VolkanHocaExercises.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UnrepeatlyElements {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter The Number For Exit Enter 0");
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            Integer number =input.nextInt();
            if(number==0){
                break;
            }if(!list.contains(number)){
                list.add(number);
            }

        }

        for (Integer number:list
             ) {
            System.out.println(number+" ");
            
        }
        System.out.println(list);
    }
}
