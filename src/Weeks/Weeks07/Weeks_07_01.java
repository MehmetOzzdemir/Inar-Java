package Weeks.Weeks07;

import java.util.Scanner;

public class Weeks_07_01 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("How many input for Array? ");
        int array=input.nextInt();
        for(int i=0;i<array;i++){
            int numbers []=new int[array];
            numbers[0]=input.nextInt();
        }



        System.out.println(numbers[1]);
    }
    public static int Minumum(int min,int num1,int num2){
        if(num1>num2){
            min=num1;
        }else{
            min=num2;
        }
        return min;
    }
    public static void getNumbersFromUsers(int [] array){
        System.out.print("Please enter %d Integers \n",array.);
    }
}
