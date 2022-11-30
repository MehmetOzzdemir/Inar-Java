package Chapters.Chapter10.Exercises_10_11;

public class Exercises_10_11 {
    public static void main(String[] args) {
            Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.printf("Area of circle 1 is %.1f\nPerimeter for Circle 1 is %.1f \n",c1.getArea(),c1.getPerimeter());
        System.out.println("Circle 1 "+(c1.contains(3,3)?"":"does not ")+"contains that specific point");
        System.out.println("Circle 1 "+(c1.contains(new Circle2D(4,5,10.5))?"":"does not ")+"contains specific circle");
        System.out.println("Circle 1 "+ (c1.overlaps(new Circle2D(3,5,2.3))?"":"does not ")+"overlaps that specific Circle." );
    }
}
