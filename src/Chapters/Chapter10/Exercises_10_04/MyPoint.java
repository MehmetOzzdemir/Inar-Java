package Chapters.Chapter10.Exercises_10_04;

public class MyPoint {
    private double x ;
    private double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public  MyPoint(){
        this(0,0);
    }
    public MyPoint(double x){
        this(x,0);
    }

    public double distance(MyPoint point){

        double distance=Math.sqrt(Math.pow(getX()-point.getX(),2)+Math.pow(getY()-point.getY(),2));
        return distance;
    }
    public double distance(double x,double y){
        double distance = Math.sqrt(Math.pow(getX()-x,2)+Math.pow(getY()-y,2));
        return distance;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }




}
