package Chapters.Chapter09.Exercises_09_08;

public class Exercises_09_08 {
    public static void main(String[] args) {
        Fan fan1 =new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2 =new Fan(Fan.MEDIUM,false,5,"blue");
        System.out.println(fan2.toString());

        Fan fan3 =new Fan();
        fan3.setOn(true);
        System.out.println(fan3.toString());
    }
}
