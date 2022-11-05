package Weeks.Weeks_13;

public class Home {

    private double large;
    private int bathroom;
    private int rooms;
    private boolean garage;
    private int price;
    private int rentPrice;
    private String cephe;
    private int year;

    public Home() {
        this(0.0, 0, 0, false, 0, 0, "", 0);
    }

    public Home(double large, int bathroom, int rooms, boolean garage, int price, int rentPrice, String cephe, int year) {
        this.large = large;
        this.bathroom = bathroom;
        this.rooms = rooms;
        this.garage = garage;
        this.price = price;
        this.rentPrice = rentPrice;
        this.cephe = cephe;
        this.year = year;
    }

    public double getLarge() {
        return this.large;
    }

    public void setLarge(double large) {
        this.large = large;
    }

    public int getBathroom() {
        return this.bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getRooms() {
        return this.rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isGarage() {
        return this.garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRentPrice() {
        return this.rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getCephe() {
        return this.cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void renovation(){
        this.price=(int)(this.price*1.1);

        this.rentPrice=(int)(this.rentPrice*1.2);
    }

    public void print() {
        System.out.println("-------------------------");
        System.out.println("This House's Large : " + large + " m^2");
        System.out.println("This House's Bathroom: " + bathroom + " Bathroom");
        System.out.println("This House's Roms have " + rooms + " rooms");
        System.out.println("This House's " + garage + " Garage");
        System.out.println("This House's Price : " + price + " Dollar");
        System.out.println("This House's Rent Price : " + rentPrice + " Dollar");
        System.out.println("This House Looks " + cephe);
        System.out.println("This House " + year + " years old");
    }
}
