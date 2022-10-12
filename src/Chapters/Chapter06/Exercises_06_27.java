package Chapters.Chapter06;

public class Exercises_06_27 {
    public static void main(String[] args) {
        int count = 0;
        for (long i = 2; count <100 ; i++) {
            if(Exercises_06_26.isPrime(i) && Exercises_06_26.isPrime(reverse(i))
            && !isPalindrome(i)){
                System.out.printf("%5d",i);
                count++;
                if(count%10==0){
                    System.out.println();
                }
            }
        }
    }
    public static long reverse(long num){
        long reverse=0;
        long temp=num;
        while (num!=0){
            reverse*=10;
            reverse+=num%10;
            num/=10;
        }
            return reverse;
    }
    public static boolean isPalindrome(long num){
        return num==reverse(num);
    }
}
