package Chapters.Chapter06;

public class Exercises_06_28 {
    public static void main(String[] args) {
        int p;
        System.out.println("p\t\t2^p-1");
        System.out.println("------------------");
        for (int i = 2; i <=31 ; i++) {
            if (Exercises_06_26.isPrime(i)){
                p=(int) Math.pow(2,i)-1;
                System.out.printf("%-6d\t%-13d \n",i,p);
            }
        }
    }
    public static  int MersennePrime(int  num){
        int p=(int) Math.pow(2,num)-1;
        return p;
    }
}
