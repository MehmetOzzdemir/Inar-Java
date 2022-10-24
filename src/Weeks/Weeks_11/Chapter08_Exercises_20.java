package Weeks.Weeks_11;

import java.util.Scanner;

public class Chapter08_Exercises_20 {

    private static Scanner input = new Scanner (System.in);
    private static final int row =6;
    private static final int col =7;
    private static int [][] board = new int[row][col];

    private static boolean isGameOver=false;

    public static void main(String[] args) {

        boolean isRedTurn =true;

        while (!isGameOver){
            askUserForInput(isRedTurn);
            int usersEntry = input.nextInt();
            if(!isValid(usersEntry)){
                System.out.println("Invalid Entry!");
                continue;
            }


            processEntryToTheBoard(usersEntry,isRedTurn);
            display();
            isRedTurn = !isRedTurn;

        }

    }

    private static void display() {
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                char c=' ';
                if (board[i][j]==1){
                    c='R';
                }else if (board[i][j]==2){
                    c='Y';
                }
                System.out.printf("|%3s",c);
            }
            System.out.println("|");
        }
    }
    private static void checkIfGameIsOver(){
        if(true){
            isGameOver=true;
        }else if(false){
            isGameOver =true;
        }else{
            isGameOver=false;
        }
    }

    private static void processEntryToTheBoard(int usersEntry, boolean isRedTurn) {
        for (int i = 0; i < row ; i++) {
            if(board[i][usersEntry] != 0){
                board[i-1][usersEntry]=isRedTurn?1:2;
                return;
            }
        }
        board[row-1][usersEntry]=isRedTurn?1:2;
    }

    private static boolean isValid(int usersEntry) {
        if(0>usersEntry || usersEntry>=col){
            return false;
        }else if(isTheColFull(usersEntry)){
            return false;
        }
        return true;
    }

    private static boolean isTheColFull(int usersEntry) {
        return board[0][usersEntry] !=0;
    }

    private  static void askUserForInput(boolean isRedTurn){
        String color =isRedTurn ? "Red":"Yellow";
        System.out.printf("Drop a %s disk at column (0-6) : ",color);
    }
}
