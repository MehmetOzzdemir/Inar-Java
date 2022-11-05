package Weeks.Weeks_13;

public class Car {
    private String model;
    private String mile;
    private int year;
    private double price;


    public Car (){
        this(null,null,0,0);
    }

    public Car(String model, String mile, int year, double price) {
        this.model = model;
        this.mile = mile;
        this.year = year;
        this.price = price;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setMile(String mile) {
        this.mile = mile;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public String getMile() {
        return mile;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
