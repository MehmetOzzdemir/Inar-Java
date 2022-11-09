package Chapters.Chapters09;

public class Exercises_09_01_Test {
    public static void main(String[] args) {
        Exercises_09_01 rectangle1 = new Exercises_09_01();
        rectangle1.print();
        Exercises_09_01 rectangle2 = new Exercises_09_01(5, 40);
        rectangle2.print();
        rectangle1.setHeight(35.9);
        rectangle1.setWidth(3.5);
        rectangle1.print();
    }
}
