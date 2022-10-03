package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_03 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter An Integer : ");
        int number = input.nextInt();
        if(isPalindrome(number)==true){
            System.out.print(number+" is a Palindrome");
        }else{
            System.out.print(number+ " is not a Palindrome");
        }
    }
    public static int reverse(int number){
        String reverse ="";
        String s1=number+"";
        for(int i=s1.length()-1;i>=0;i--){
            reverse+=s1.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
    public static boolean isPalindrome(int number){
        if(number == reverse(number)){
            return true;
        }else{
            return false;
        }
    }
}
