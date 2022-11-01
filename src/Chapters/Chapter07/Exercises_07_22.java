package Chapters.Chapter07;

import java.util.Scanner;

public class Exercises_07_22 {
    public static void main(String[] args) {
        /*
        (Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens
        on a chessboard such that no two queens can attack each other (i.e., no two queens
        are on the same row, same column, or same diagonal). There are many possible
        solutions. Write a program that displays one such solution. A sample output is
        shown below:
         //
         0- santanç tahtası done

         1- 8 Adet vezir
         2- aynı satır sütün ve çaprazda olmayacak
         */
        char[] board;

        do {

            board = getBoard();


            placeQueens(board);

        } while (isAttacking(board));

        // Display solution
        print(board);
    }

    public static void placeQueens(char[] board) {
        int location;
        for (int i = 0; i < 8; i++) {
            do {
                location = placeQueens();
            } while (isOccupied(board[location]));
            board[location] = 'Q';
        }
    }

    public static int placeQueens() {
        return (int)(Math.random() * 64);
    }

    public static boolean isAttacking(char[] board) {
        return isSameRow(board) || isSameColumn(board) ||  isSameDiagonal(board);
    }

    public static boolean isSameRow(char[] board) {
        int[] rows = new int[8];
        for (int i = 0; i < board.length; i++) {
            if (isOccupied(board[i])) {
                rows[getRow(i)]++;
            }
            if (rows[getRow(i)] > 1)
                return true;
        }
        return false;
    }

    public static boolean isSameColumn(char[] board) {
        int[] columns = new int[8];
        for (int i = 0; i < board.length; i++) {
            if (isOccupied(board[i])) {
                columns[getColumn(i)]++;
            }
            if (columns[getColumn(i)] > 1)
                return true;
        }
        return false;
    }

    public static boolean isSameDiagonal(char[] board) {
        for (int i = 0; i < board.length; i++) {
            if (isOccupied(board[i])) {
                for (int j = 0; j < board.length; j++) {
                    if (isOccupied(board[j]) && Math.abs(getColumn(j) - getColumn(i)) ==
                            Math.abs(getRow(j) - getRow(i)) && j != i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isOccupied(char x) {
        return x == 'Q';
    }

    public static char[] getBoard() {
        char[] board = new char[64];
        for (int i = 0; i < board.length; i++)
            board[i] = ' ';
        return board;
    }

    public static void print(char[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(
                    "|" + ((getRow(i + 1) == 0) ? board[i] + "|\n" : board[i]));
        }
    }

    public static int getRow(int index) {
        return index % 8;
    }

    public static int getColumn(int index) {
        return index / 8;
    }
}