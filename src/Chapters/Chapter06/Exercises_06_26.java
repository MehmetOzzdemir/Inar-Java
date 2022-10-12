package Chapters.Chapter06;

public class Exercises_06_26 {
    public static void main(String[] args) {

        int count=0;
        for (int i = 2; count <100 ; i++) {
            if(isPrime(i) && isPalindrome(i)){
                System.out.printf("%8d", i);
                count++;
            if (count % 10 == 0){
                System.out.println();
                }
            }
        }
    }
    public static boolean isPrime(long num){
        for (int i = 2; i <=num/2; i++) {
                if(num%i==0){
                   return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome (long num){
        long reverse = 0;
        long temp=num;
        while (num != 0) {
            reverse *= 10;
            reverse += num % 10;
            num /= 10;
        }
        if(temp==reverse){ //check palindrome
            return true;
        }else {
            return false;
        }
    }
}
