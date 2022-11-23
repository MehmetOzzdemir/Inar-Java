package Chapters.Chapter11.VolkanHocaExercises.GeometricObject;

import Chapters.Chapter11.VolkanHocaExercises.GeometricObject.Circle;
import Chapters.Chapter11.VolkanHocaExercises.GeometricObject.GeometricObject;
import Chapters.Chapter11.VolkanHocaExercises.GeometricObject.Rectangle;

public class Polymorphism {
    public static void main(String[] args) {
        displayObject3(new Circle(5, "Mavi", true));
        displayObject3(new Rectangle("Blue", true, 5, 15));
    }
    public static void displayObject3(Circle c1) {

        System.out.println("Circle Radius : " + c1.getRadius());
    }
    public static void displayObject3(Rectangle d) {

        System.out.println("Rectangle height : " + d.getHeight() + " Rectangle weight : " + d.getWeight() + " overload");
    }

    public static void displayObject3(GeometricObject go1) {
        if (go1 instanceof Circle) {
            Circle c1 = (Circle) go1;
            System.out.println("Circle Radius : " + c1.getRadius());
        } else if (go1 instanceof Rectangle) {
            Rectangle d = (Rectangle) go1;
            System.out.println("Rectangle height : " + d.getHeight() + " Rectangle weight : " + d.getWeight());
        }
    }

    public static void displayObject(GeometricObject go) {
        System.out.println("Create Time : " + go.getCreateTime());
        System.out.println("Color : " + go.getColor());
        System.out.println("is Full? " + go.isFull());
        System.out.println();
        System.out.println(go.toString());
        System.out.println();
    }

    public static void displayObject2(Object ob) {

        System.out.println(ob.toString());
        System.out.println();
    }
}
