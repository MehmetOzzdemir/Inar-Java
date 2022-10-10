package Chapters.Chapter06;

import java.util.Locale;
import java.util.Scanner;

public class Exercises_06_23 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter A String : ");
        String word = input.nextLine().toLowerCase();
        System.out.print("Enter A Character : ");
        char ch=input.next().toLowerCase().charAt(0);
        System.out.print(count(word,ch));
    }
    public static int count(String str, char a){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==a){
                count++;
            }
        }
        return count;
    }
}
