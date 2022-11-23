package Chapters.Chapter11.VolkanHocaExercises.GeometricObject;

import java.util.Objects;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean full) {
        super(color,full);
        this.radius = radius;
    }
    @Override
    public String toString(){
        return super.toString()+"\nRadius : "+getRadius()+"\nArea : "+getArea()+"\nPerimeter : "+getPerimeter();
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double Diameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The circle Created " + getCreateTime() + " and the radius is " + getRadius());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

}
