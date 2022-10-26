package Chapters.Chapter07;

public class Exercises_07_06 {
    public static void main(String[] args) {
    /*
    (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number n is prime
    by checking whether  2, 3, 4, 5, 6, ..., n/2 is a divisor. If a divisor
    is found, n is not prime. A more efficient approach is to check whether any of the
    prime numbers less than or equal to 2n can divide n evenly. If not, n is prime.
    Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
    You need to use an array to store the prime numbers and later use them to check
    whether they are possible divisors for n
     */
        int [] primeNumbers = new int[50];
        int count = 0;
        for (int i = 2; count <50 ; i++) {
            if(primeNumber(i)){
                primeNumbers[count]=i;
                System.out.printf("%4d",primeNumbers[count]);
                count++;
                if(count%10==0){
                    System.out.println();
                }
            }
            if(count==50){
                break;
            }
        }

    }
    public static boolean primeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}

