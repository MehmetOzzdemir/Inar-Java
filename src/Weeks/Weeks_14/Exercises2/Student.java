package Weeks.Weeks_14.Exercises2;

public class Student {
    protected String name;
    protected int age;
    protected String gender;
    protected  boolean isTurk;
    protected  double height;
    protected double weight;

    public Student(){
       this.name="Mehmet";
       this.age=28;
       this.gender="Male";
       this.isTurk=true;
       this.height=165;
       this.weight=65;
    }
    public Student(String name, int age, String gender, boolean isTurk, double height, double weight){
        this.age=age;
        this.isTurk=isTurk;
        this.gender=gender;
        this.name=name;
        this.weight=weight;
        this.height=height;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isTurk() {
        return isTurk;
    }

    public void setTurk(boolean turk) {
        isTurk = turk;
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





    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", isTurk=" + isTurk +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
    public double getBMI(){
        double bmi=getWeight()/(Math.pow(getHeight(),2));
        return bmi;
    }
    public void BMIStatus(){
        if(getBMI()>=25){
            System.out.println("Your BMI very HIGH");
        } else if (getBMI()<25 && getBMI()>20) {
            System.out.println("Your BMI normal.");

        }else
            System.out.println("Your BMI is LOW");
    }




}
