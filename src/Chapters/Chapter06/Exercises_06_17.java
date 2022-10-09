package Chapters.Chapter06;

public class Exercises_06_17 {
    public static void main(String[] args) {
        printMatrix(9);
    }
    public static void printMatrix(int n){
        for(int i=0;i<n;i++){
            for (int j = 0; j <n ; j++) {
                double random=(Math.random()*2);
                System.out.print((int) random+" ");
            }
            System.out.println();
        }
    }
}
