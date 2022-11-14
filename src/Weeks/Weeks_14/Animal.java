package Weeks.Weeks_14;

public class Animal {

    protected double weight;
    protected double height;
    protected boolean hasSwimmingSkills;
    protected boolean hasFlyingSkills;

    public Animal(){
        this.hasFlyingSkills=false;
        this.hasSwimmingSkills=false;
        this.weight=0;
        this.height=0;
    }
    public Animal(double weight,double height,boolean hasSwimmingSkills,boolean hasFlyingSkills){
        this.hasFlyingSkills=hasFlyingSkills;
        this.hasSwimmingSkills=hasSwimmingSkills;
        this.weight=weight;
        this.height=height;
    }

    public void runs(){
        System.out.println("Animal is running");
    }
    public void eats(){
        System.out.println("Animal is Eating");
    }
    public void sleep(){
        System.out.println("Animal is Sleeping");
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

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }




}
