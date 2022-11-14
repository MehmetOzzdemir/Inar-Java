package Chapters.Chapter09.Exercises_09_10;

public class QuadraticEquation {
    //Data  Field
    private double a;
    private double b;
    private double c;

    //Constructor

    public QuadraticEquation(){
        this(0,0,0);
    }
    public QuadraticEquation(double a,double b, double c ){
        this.a=a;
        this.b=b;
        this.c=c;
    }


    //Getter Setter
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    //Methods
    public double getDiscriminant(){
        double discriminant = Math.pow(getB(),2)-(4*getA()*getC());
        return discriminant;
    }
    public String checkDiscriminant(){
        if(getDiscriminant()>0){
            return "The Equation Has Two Roots ";
        } else if (getDiscriminant()==0) {
            return "The Equation Has One Roots ";
        }else{
            return "The Equation Has No Roots ";
        }

    }
    public double getRoot1(){
        if(getDiscriminant()<0) {
            return 0;
        }
        return (-getB()+(Math.sqrt(getDiscriminant())))/(2*getA());
    }

    public double getRoot2(){
        if(getDiscriminant()<0) {
            return 0;
        }
        return (-getB()-(Math.sqrt(getDiscriminant())))/(2*getA());
    }
    public void print(){
        System.out.println("--------QuadraticEquation------------");
        System.out.println("A : "+getA());
        System.out.println("B : "+getB());
        System.out.println("C : "+getC());
        System.out.println("Discriminant : "+getDiscriminant());
        System.out.println(checkDiscriminant());
        System.out.println("Root 1 : "+getRoot1());
        System.out.println("Root 2 : "+getRoot2());
    }
}
