package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_18 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter The Password : ");
        String password = input.nextLine();
        if(validPassword(password)){
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password");
        }
    }
    public static boolean validPassword(String password){
        int length=8;
        int leastDigits =2;
        boolean validPassword=lengthPassword(password,length)&&onlyLettersAndDigit(password)
                &&leastTwoDigits(password,leastDigits);
            return validPassword;
    }

    public static boolean onlyLettersAndDigit(String password) {
        for (int i = 0; i <password.length() ; i++) {
            if(!Character.isLetterOrDigit(password.charAt(i))){
                return false;
            }
        }
        return true;

    }
    public static boolean leastTwoDigits(String password,int digits){
        int numberofDigits=0;
        for (int i = 0; i <password.length() ; i++) {
            if (Character.isDigit(password.charAt(i))){
                numberofDigits++;
            }
            if (numberofDigits>=digits){
                return true;
            }
        }
        return false;
    }

    public static boolean lengthPassword(String password,int length){
        return password.length()>=length;
    }
}
