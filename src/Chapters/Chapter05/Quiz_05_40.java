package chapters.chapter_05;

import java.util.Scanner;

public class Quiz_05_40 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean decision =true;
		System.out.println("Welcome to Heads or Tails Game");
		System.out.println("_______________________________");
		System.out.println();
		String repeat="";
		while(decision ==true){
		System.out.println("How Many Times Do You Want To Play?");
		int playTime = input.nextInt();
		int heads=0;
		int tails=0;
		for (int i = 0; i < playTime; i++) {
			double coin = (int) (Math.random() * 2) + 1;
			if (coin == 1) {
				System.out.println("Heads");
				heads++;
			} else if (coin == 2) {
				System.out.println("Tails");
				tails++;
			}
		}
		System.out.println("For 1 Milion Heads or Tails :\n"+heads+" Heads\n"+tails+" Tails");
		System.out.print("Do You Want To Play Again (Y/N) ?");
		repeat =input.next().toUpperCase();
		if(repeat.charAt(0)=='Y') {
			decision =true;
		} else if(repeat.charAt(0)=='N'){
			decision=false;
		}
		System.out.println();
		}
	}

}
