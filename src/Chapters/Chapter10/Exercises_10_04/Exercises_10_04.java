package Chapters.Chapter10.Exercises_10_04;

public class Exercises_10_04 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3,5);
        MyPoint point2 = new MyPoint();
        double distance=point1.distance(point2);
        System.out.println(distance);
        System.out.println(point2.distance(7,9));
    }
}
