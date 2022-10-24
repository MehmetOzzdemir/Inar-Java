package Weeks.Weeks_07;

public class DeckOfCards {
    public static void main(String[] args) {
        String [] suitsArray = {"Spades","Hearts","Diamonds","Clubs"};
        String [] ranksArray = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        int [] deck =new int[52];
        for (int i = 0; i < deck.length ; i++) {
            deck[i]=i;


        }
        //for (int i = 0; i < deck.length ; i++) {
        //   int random=(int)(Math.random()*52);
        //   int temp = deck[i];
        //   deck[i]=deck[random];
        //   deck[random]=temp;

     // (int i = 0; i <4 ; i++) {
     // System.out.println(deck[i]);
     //
        for (int i = 0; i <52 ; i++) {
            String suits = suitsArray[deck[i]/13];
            String rank = ranksArray[deck[i]%13];
            System.out.println(suits+ " "+ rank);
        }



    }
}
