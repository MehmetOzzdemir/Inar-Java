package Chapters.Chapter10.Exercises_10_05;

import java.util.Scanner;

public class Exercises_10_05 {
    public static void main(String[] args) {
        int a=getGromUser();
        StackOfIntegers factors =getFactors(a);
        reversePrint(factors);
    }

    public static StackOfIntegers getFactors(int number) {
        StackOfIntegers factors = new StackOfIntegers();
        int divisor=2;
        while(number!=1){
            if(number%divisor==0){
                factors.push(divisor);
                number/=divisor;
            }else{
                divisor++;
            }
        }
        return factors;
    }

    public static int getGromUser(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter A Positive Integer : ");
        int number =input.nextInt();
        return number;
    }

    public static void reversePrint(StackOfIntegers factors){
        StackOfIntegers factorsReverse =new StackOfIntegers();
        while (!factors.isEmpty()){
            System.out.print(factors.peek()+" ");
            factorsReverse.push(factors.pop());
        }
        System.out.println();
    }

}
