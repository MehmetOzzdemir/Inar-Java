package Chapters.Chapter06;

public class Exercises_06_10 {
    public static void main(String[] args) {
        int count=0;
        for(int i=2;i<10000;i++){
            if (IsPrime(i)){
                count++;
                System.out.print(i+" ");
            }if(count==10){
                System.out.println();
                count=0;
            }
        }
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
