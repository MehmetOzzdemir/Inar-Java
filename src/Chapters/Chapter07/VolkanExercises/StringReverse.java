package Chapters.Chapter07.VolkanExercises;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter A String : ");
        String word = input.nextLine();

        char [] cArr = word.toCharArray();
        char [] reversCArr = reverse(cArr);

        System.out.print("Your Word : ");
        System.out.println(cArr);
        System.out.print("Your reverse : ");
        System.out.println(reversCArr);
    }

    public static char[] reverse(char[] cArr) {
        int count = cArr.length-1;
        char []reverse=new char[cArr.length];
        for (int i = 0; i < cArr.length ; i++) {
            reverse[count]=cArr[i];
            count--;
        }
        return reverse;
    }
}
