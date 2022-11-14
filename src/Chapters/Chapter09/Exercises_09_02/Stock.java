package Chapters.Chapter09.Exercises_09_02;

public class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(){
        this(null,null);
    }
    public Stock(String symbol, String name){
        this.symbol=symbol;
        this.name=name;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.previousClosingPrice=this.currentPrice;
        this.currentPrice = currentPrice;
    }
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getChangePercent(){
            return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
    }
    public void print(){
        System.out.println("------STOCK-------");
        System.out.println("Stock's Symbol : "+this.symbol);
        System.out.println("Stock's Name : "+this.name);
        System.out.println("Stock's Current Price : "+this.currentPrice);
        System.out.println("Stock's Previous Closing Price : "+this.previousClosingPrice);
        System.out.println("Stock's Change Percent : "+getChangePercent());
    }

}
