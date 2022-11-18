package Chapters.Chapter10.Exercises_10_02;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METER_PER_INCHES = 0.0254;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }


    public BMI(String name, double weight, double height) {
        this(name, 27, weight, height);
    }

    public BMI(String name, int age, double weight, double feet, double inches) {
        this(name, age, weight, (feet * 12 )+ inches);
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {
        double bmi =weight*KILOGRAMS_PER_POUND  / (Math.pow((height*METER_PER_INCHES), 2));
        return bmi;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else
            return "Obese";

    }


}
