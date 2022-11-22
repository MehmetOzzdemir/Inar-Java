package Chapters.Chapter11.VolkanHocaExercises.GeometricObject;

public class GeometricObjectTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1.toString());
        System.out.println("-----------------");
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString() + "\nArea : " + r1.getArea());
    }
}
