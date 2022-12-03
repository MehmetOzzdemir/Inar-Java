package Chapters.Chapter11.Exercises_11_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercises_11_04 {
    public static void main(String[] args) {
        ArrayList<Integer>list=getFromUser();
        Integer num =largestNumber(list);
        System.out.println("Largest Number : "+num);
        System.out.println("Size The List is "+list.size());

    }

    public static ArrayList<Integer> getFromUser() {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();
        System.out.print("Enter The Integer (input 0 for ends) : ");
        int numbers =input.nextInt();

        while (numbers!=0){
            list.add(numbers);
            numbers=input.nextInt();
        }
        return list;
    }
    public static Integer largestNumber(ArrayList<Integer>list){
            if(list==null || list.isEmpty()){
                return null;
            }
            int maxNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>maxNumber){
                maxNumber= list.get(i);
            }
        }
        return maxNumber;
    }
}
