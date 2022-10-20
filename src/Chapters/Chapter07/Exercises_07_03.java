package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_03 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter The Array's Length : ");
        int num =input.nextInt();
        int [] numbers = new int[num];
        System.out.print("Enter The Integers Between 1 and 100 : ");
        int count=0;
        int number;
        do {
            number =input.nextInt();
            numbers[count]=number;
            count++;
        }while (number != 0);
            countOccurence(numbers);


    }
    public static void countOccurence(int[] numbers) {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] == i)
                    count += 1;
            }
            if (count != 0)
                System.out.printf("%d occurs %d %s%n",
                        i, count, count > 1 ? "times" : "time");
        }
    }
}
