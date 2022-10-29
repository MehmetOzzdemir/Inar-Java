package Weeks.Weeks_12;

public class Circle {

    //Date Field
    String color ;
    double radius;
    double area;
    double perimeter;
    boolean isFilled;


    //Constructor
    //1-Some Class Name
    //2-No return type
    //3-Static-Nonstatic is not an option
    public Circle(){
       /* radius=1;
        isFilled=false;
        color="black";
        perimeter=getPerimeter();
        area=getArea();*/

    }
    public  Circle(double r){
        radius=r;
    }
    //Methods

    public double getArea(){
            //TODO
        area = Math.PI*Math.pow(radius,2);
        return area;
    }
    public double getPerimeter(){
        perimeter = 2*Math.PI*radius;
        return perimeter;
    }
    public void filltheCircle(){
            isFilled=true;
    }
    public void cleanCircle(){
        isFilled=false;

    }
    public void print(){
        System.out.println("--------------------");
        System.out.println("radius : "+radius);
        System.out.println("permimeter : "+perimeter);
        System.out.println("area : "+area);
        System.out.println("radius : "+radius);
        System.out.println("color : "+color);
        System.out.println("----------------");;

    }

}
