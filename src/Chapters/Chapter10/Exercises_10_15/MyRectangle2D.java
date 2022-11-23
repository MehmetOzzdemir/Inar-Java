package Chapters.Chapter10.Exercises_10_15;

public class MyRectangle2D {
    private double x;
    private double y;
    private double weight;
    private double height;

    public MyRectangle2D(){
        this(0,0,1,1);
    }
    public MyRectangle2D(double x, double y, double weight, double height) {
        this.x = x;
        this.y = y;
        this.weight = weight;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
