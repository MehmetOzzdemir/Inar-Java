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
        int[] chessTable = new int[8];
        int row = 0;
        int count = 0;

        while (row < chessTable.length) {
            count++;
            if (isThereAPLaceToPutAQueen(chessTable, row)) {
                putAQueen(chessTable, row);
                row++;
            } else {
                row = 0;
            }
        }
        displayChessTable(chessTable, count);

    }

    // Checks for the next row int chess table whether there is place for queen
    public static boolean isThereAPLaceToPutAQueen(int[] chessTable, int row) {
        boolean[] checkChessTable = new boolean[8];
        fill(checkChessTable, true);// You may also use java.util.Arrays.fill(checkChessTable, true);
        // Turns into false the places that can't be queen put
        for (int i = 0; i < row; i++) {
            checkChessTable[chessTable[i]] = false;
            if (( chessTable[i] + row - i) < 8) {
                checkChessTable[row - i + chessTable[i]] = false;
            }
            if ((chessTable[i] - (row - i)) > 0) {
                checkChessTable[chessTable[i] - (row - i)] = false;
            }
        }

        for (int i = 0; i < checkChessTable.length; i++) {
            if (checkChessTable[i]) {
                return true;
            }
        }
        return false;
    }

    public static void fill(boolean[] checkChessTable, boolean b) {
        for (int i = 0; i < checkChessTable.length; i++) {
            checkChessTable[i] = b;
        }
    }

    // Puts a queen to row randomly
    public static void putAQueen(int[] chessTable, int row) {
        int queensPlace;
        while (true) {
            queensPlace = (int) (Math.random() * 8);
            if (isThatPlaceAvailable(chessTable, queensPlace, row)) {
                break;
            }
        }
        chessTable[row] = queensPlace;
    }

    // Checks the queens place correctness
    private static boolean isThatPlaceAvailable(int[] chessTable, int queensPlace, int row) {
        boolean[] checkSuitable = new boolean[8];
       fill(checkSuitable, true);
        // Turn into false the places that queen can't be putted
        for (int i = 0; i < row; i++) {
            checkSuitable[chessTable[i]] = false;
            if ((row - i + chessTable[i]) < 8) {
                checkSuitable[row - i + chessTable[i]] = false;
            }
            if (chessTable[i] - (row - i) > 0) {
                checkSuitable[chessTable[i] - (row - i)] = false;
            }
        }
        return checkSuitable[queensPlace];

    }

    public static void displayChessTable(int[] chessTable, int count) {
        System.out.println("It takes " + count + " times");

        for (int i = 0; i < chessTable.length; i++) {
            System.out.print("|");
            for (int j = 0; j < chessTable[i]; j++) {
                System.out.print(" |");
            }
            System.out.print("Q| ");

            for (int j = chessTable[i] + 1; j < chessTable.length; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }
    }
}