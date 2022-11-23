package Chapters.Chapter11.VolkanHocaExercises;

import Chapters.Chapter11.VolkanHocaExercises.GeometricObject.Circle;

public class EqualMethod {
    public static void main(String[] args) {


        Object c1 = new Circle(10);
        Object c2 = new Circle(110);

      if (c1 == c2) {
            System.out.println("c1 and c2 same instance");
        } else {
            System.out.println("C1 and C2 diffrent instance");
        }

        if (c1.equals(c2)) {
            System.out.println("c1 and c2 equals");
        } else {
            System.out.println("C1 and C2 not equals");
        }
    }
}