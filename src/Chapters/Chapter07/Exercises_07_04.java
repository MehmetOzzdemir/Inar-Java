package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_04 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int [] scores =new int[100];
        System.out.print("Enter Scores :");

        int num;
        int average=0;
        int numberOfScores=0;
        for (int i = 0; i < scores.length ; i++) {
            num = input.nextInt();
            if(num<0){
                break;
            }
            scores[i]=num;
            average+=num;
            numberOfScores++;
        }

        average/=numberOfScores;
        int aboveOrEqual=0;
        int below=0;

        for (int i = 0; i < numberOfScores ; i++) {
            if(scores[i]>=average){
                aboveOrEqual++;
            }else{
                below++;
            }
        }

        System.out.println("Average Of Scores : "+average);
        System.out.println("Number of Scores Above Or Equal To Average : "+aboveOrEqual);
        System.out.println("Number of Scores Below To Average : "+below);

    }
}
