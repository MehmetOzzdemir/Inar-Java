package Chapters.Chapter09.VolkanHocaExercises;

public class NesneArray {
    public static void main(String[] args) {
        Circle [] array = new Circle[100];

        for (int i = 0; i <array.length; i++) {
            array[i]=new Circle(i+1);
        }
        System.out.println(array[15].getPerimeter());
        System.out.println(array[16].getPerimeter());
    }
}
