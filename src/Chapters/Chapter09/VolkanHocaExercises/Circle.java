package Chapters.Chapter09.VolkanHocaExercises;

public class Circle {
    private double r;

    Circle(){
        r=5;
    }

    double getArea(){
        return Math.pow(r,2)*Math.PI;
    }
    double getPerimeter(){
        return 2*Math.PI*r;
    }
    void setR(double y){
        r=y;
    }
}
