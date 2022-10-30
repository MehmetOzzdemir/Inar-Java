package Weeks.Weeks_12;

public class Player {
    private  String name;
    private int fee;

    public Player(){
        this("default",0);
    }
    public Player(String name ,int fee){
        this.name=name;
        this.fee=fee;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFee() {
        return this.fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    public void increasePrice(int price){
        setFee(this.fee+price);

    }
    public void decreasePrice (int price){
        setFee(this.fee-price>0?this.fee-price:0);
    }
}
