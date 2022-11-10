package Chapters.Chapter07;

public class Exercises_07_24 {
    public static void main(String[] args) {
        int [] deck =new int[52];
        int [] pick = new int[4];

        for (int i = 1; i <=deck.length ; i++) {
            deck[i-1]=i;
        }
        System.out.println(pickCards(deck));
       // System.out.println(pickCards(deck,pick);
    }
    public static void pickCards(int [] deck,int []pick){
        for (int i = 0; i < pick.length ; i++) {
            pick[i]=deck[pickCards(deck)];
        }
    }
    public static int pickCards(int [] deck){
        return (int)(Math.random()* deck.length);
    }
}
