package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_20 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter A String : ");
        String s = input.nextLine();
        System.out.println(s+" String's Number of Letters :"+countLetters(s));
    }
    public static int countLetters(String s){
        int numberLetters=0;
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isLetter(s.charAt(i))){
                numberLetters++;
            }
        }
        return numberLetters;
    }
}
