package Chapters.Chapters09.Exercises_09_08;

public class Fan {
    private int speed ;
    private boolean on;
    private double radius;
    private String color;

    final static int SLOW=1;
    final static int MEDIUM=2;
    final static int FAST=3;

    public Fan(){
        speed=SLOW;
        on=false;
        radius=5;
        color="blue";
    }
    public Fan(int speed ,boolean on,double radius,String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }
    public String toString(){
        String output;
        System.out.println("-------------------------------------");
        if(isOn()){
            output="Fan Speed : "+getSpeed()+"\nRadius : "+getRadius()+"\nColor : "+getColor();
        }else{
            output="Fan is off " +"\nRadius : "+getRadius()+"\nColor : "+getColor();
        }
        return output;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
