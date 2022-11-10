package Chapters.Chapters09;

public class Exercises_09_01_Test {
    public static void main(String[] args) {
        Triangle rectangle1 = new Triangle();
        rectangle1.print();
        Triangle rectangle2 = new Triangle(5, 40);
        rectangle2.print();
        rectangle1.setHeight(35.9);
        rectangle1.setWidth(3.5);
        rectangle1.print();
    }
}
