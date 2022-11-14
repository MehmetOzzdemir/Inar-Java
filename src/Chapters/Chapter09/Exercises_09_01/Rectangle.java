package Chapters.Chapter09.Exercises_09_01;

public class Rectangle {

    private double width;
    private double height;
    private double perimeter;

    private double area;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        /*perimeter=this.getPerimeter();
        area=this.getArea(width,height);*/
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        double area = width * height ;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2*(width+height);
        return perimeter;
    }
    public void print(){
        System.out.println("------Rectangle------");
        System.out.println("Width : "+this.width);
        System.out.println("Height : "+this.height);
        System.out.println("Perimeter : "+this.getPerimeter());
        System.out.println("Area : "+this.getArea());
    }


}



