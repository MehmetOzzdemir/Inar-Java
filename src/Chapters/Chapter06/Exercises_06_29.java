package Chapters.Chapter06;

public class Exercises_06_29 {
    public static void main(String[] args) {
        for (int i = 2; i <1000 ; i++) {
            if(twinPrime(i)){
                System.out.printf("(%-3d,%-3d)\n",i,(i+2));
            }

        }
    }
    public static boolean twinPrime(int num1){
        if(isPrime(num1)&&isPrime(num1+2)){
            return  true;
        }else {
            return  false;
        }
    }
    public static boolean isPrime(int num){
        for (int i = 2; i <num ; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
