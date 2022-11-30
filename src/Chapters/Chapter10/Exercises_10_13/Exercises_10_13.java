package Chapters.Chapter10.Exercises_10_13;

public class Exercises_10_13 {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
        System.out.printf("Area for rectangle t1 is %.1f\nPerimeter for rectangle t1 is %.1f\n",
                r1.getArea(), r1.getPerimeter());
        System.out.println("Triangle t1 " + (r1.contains(3, 3) ? "" : "doesn't ") +
                "contains that specified point.");
        System.out.println("Rectangle r1 " + (r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)) ?
                "" : "doesn't ") + "contains that specified rectangle.");

        System.out.println("Triangle t1 " + (r1.overlaps(new MyRectangle2D(3,5,2.3,5.4) )? "" : "doesn't ") +
                "overlaps that specified triangle.");
    }
}
