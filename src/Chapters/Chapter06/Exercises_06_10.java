package Chapters.Chapter06;

public class Exercises_06_10 {
    public static void main(String[] args) {

    }
    public static boolean IsPrime (int number){
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
                }
             }
        return true;
         }
}
