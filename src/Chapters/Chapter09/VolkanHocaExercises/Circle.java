package Chapters.Chapter09.VolkanHocaExercises;

public class Circle {
    private double r;

    Circle(){
        r=5;
    }
    Circle(double r){
        this.r=r;
    }

    double getArea(){
        return Math.pow(r,2)*Math.PI;
    }
    double getPerimeter(){
        return 2*Math.PI*r;
    }

    double getR(){
        return this.r;
    }
    void setR(double y){
        r=y;
    }
}
