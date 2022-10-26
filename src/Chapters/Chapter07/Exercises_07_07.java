package Chapters.Chapter07;

public class Exercises_07_07 {
    public static void main(String[] args) {

        /*
        (Count single digits) Write a program that generates 100 random integers between
        0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
        say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
         */
        int [] counts =new int[10];

        for (int i = 0; i <100  ; i++) {
            int number=(int)(Math.random()*10);
            counts[number]++;
        }

        for (int i = 0; i <counts.length ; i++) {
            System.out.println(i+"'s : "+counts[i]);

        }

    }
}
