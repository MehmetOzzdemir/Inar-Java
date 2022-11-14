package Chapters.Chapter09.Exercises_09_11;

public class LinearEquation {
    //Data Field

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    //Constructor

    //DefaultValues
    public LinearEquation(){
        this(0,0,0,0,0,0);
    }

    public LinearEquation(double a,double b, double c ,double d, double e,double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
        //Methods

    public boolean isSolvable(){
        if((getA()*getD())-(getB()*getC())!=0){
            return true;
        }
        return false;
    }
    public double getX(){
        return ((getE()*getD())-(getB()*getF()))/(getA()*getD())-(getB()*getC());
    }
    public double getY(){
        return  (getA()*getF())-(getE()*getC())/(getA()*getD())-(getB()*getC());
    }
}
