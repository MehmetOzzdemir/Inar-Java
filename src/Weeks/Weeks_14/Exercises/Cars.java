package Weeks.Weeks_14.Exercises;

public class Cars {
    protected String type;
    protected double horsePower;
    protected int numberOfDoor;
    protected String color;
    protected int year;
    protected boolean isAutomatic;

    public Cars(String type,double horsePower,int numberOfDoor,String color,int year,boolean isAutomatic){
        this.type=type;
        this.horsePower=horsePower;
        this.numberOfDoor=numberOfDoor;
        this.color=color;
        this.year=year;
        this.isAutomatic=isAutomatic;
    }
    public Cars(){
        this("Sedan",150,5,"Black",2019,true);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
    public String toString(){
        String output;
        output="Type : "+getType()+"\nHorse Power : "+getHorsePower()+"\nNumber Of Doors : "+getNumberOfDoor()+"\nColor : "+getColor()+"\nYear : "+getYear()+"\nAutomatic : "+isAutomatic();
        return output;
    }

}
