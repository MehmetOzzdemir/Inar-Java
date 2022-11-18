package Chapters.Chapter10.Exercises_10_02;

public class Exercises_10_02 {
    public static void main(String[] args) {
        BMI b1 = new BMI("Mehmet",27,165,70);
        System.out.println("------BMI------");
        System.out.println("---------------");
        System.out.println("Name : "+b1.getName());
        System.out.println("Age : "+b1.getAge());
        System.out.println("Weight and Heigth : "+b1.getWeight()+" "+b1.getHeight());
        System.out.println("BMI : "+b1.getBMI()+" and "+b1.getStatus());
    }
}
