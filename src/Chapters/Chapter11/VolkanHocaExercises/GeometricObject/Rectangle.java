package Chapters.Chapter11.VolkanHocaExercises.GeometricObject;

import Chapters.Chapter11.VolkanHocaExercises.GeometricObject.GeometricObject;

public class Rectangle extends GeometricObject {
    private double height;
    private double weight;


    public Rectangle(){
        this("Blue",true,5,10);
    }
    public Rectangle(String color,boolean full,double weight,double height){
        super(color,full);
        this.weight=weight;
        this.height=height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    public double getPerimeter(){
        return 2*(weight*height);
    }
    public double getArea(){
        return weight*height;
    }
    public String printRectangle(){
        return "Create Time : "+getCreateTime()+"\nHeight "+getHeight()+" and Weight "+getWeight();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
