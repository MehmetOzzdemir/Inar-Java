package Chapters.Chapters09.Exercises_09_01;

public class Exercises_09_01_Test {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.print();
        Rectangle rectangle2 = new Rectangle(5, 40);
        rectangle2.print();
        rectangle1.setHeight(35.9);
        rectangle1.setWidth(3.5);
        rectangle1.print();
    }
}
