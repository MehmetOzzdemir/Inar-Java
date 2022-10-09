package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A String : ");
        String s = input.nextLine();

        for (int i = 0; i <s.length() ; i++) {
            if(Character.isLetter(s.charAt(i))){
                System.out.print(getNumber(Character.toUpperCase(s.charAt(i))));
            }else{
                System.out.print(s.charAt(i));
            }
        }
    }

    public static int getNumber(char uppercaseLetter) {

        if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C') {
            return 2;
        } else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F') {
            return 3;
        } else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I') {
            return 4;
        }else if(uppercaseLetter>='J' && uppercaseLetter<='L'){
            return 5;
        }else if(uppercaseLetter>='M' && uppercaseLetter<='O'){
            return 6;
        }else if(uppercaseLetter>='P' && uppercaseLetter<='S'){
            return 7;
        }else if(uppercaseLetter>='T' && uppercaseLetter<='V'){
            return 8;
        }else if(uppercaseLetter>='W' && uppercaseLetter<='Z'){
            return 9;
        }
        return -1;
    }
}
