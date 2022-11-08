package Chapters.Chapter07;

public class Exercises_07_29 {
    public static void main(String[] args) {
        /*
        (Game: pick four cards) Write a program that picks four cards from a deck of 52
        cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13,
        12, and 11, respectively. Your program should display the number of picks that
        yields the sum of 24.
         */
        int [] deck=new int[52] ;

        while (sum(deck) != 24){
            deck=new int[52];
            pickFourCards(deck);

        }

        print(deck);
    }


    public static void pickFourCards(int [] deck){
        for (int i = 0; i <4 ; i++) {
            deck[(int)(Math.random()*52)]++;
        }
    }
    public static int sum(int [] deck){
        int sum=0;
        for (int i = 0; i < deck.length ; i++) {
            sum +=((i+1)%13)*deck[i];
        }
        return sum;
    }
    public static void print(int []deck){
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        System.out.print("The number of picks that yields the sum of 24: ");
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] > 0)
                System.out.print(ranks[i % 13] + " ");
        }
        System.out.println();
    }
}

