package Chapters.Chapter11.Exercises_11_03;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annuallyInterestRate;
    private Date dateCreated;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annuallyInterestRate = 0;
        dateCreated=new Date();

    }
    public Account(){
        this(0,0);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnuallyInterestRate(double annuallyInterestRate) {
        this.annuallyInterestRate = annuallyInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnuallyInterestRate() {
        return annuallyInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return getAnnuallyInterestRate()/1200;
    }
    public double getMonthlyInterest(){
        return getBalance()*getMonthlyInterestRate();
    }
    public void withdraw(double withdrawAmount){
        setBalance(getBalance()-withdrawAmount);
    }
    public void deposit(double depositAmount){
        setBalance(getBalance()+depositAmount);
    }

    @Override
    public String toString() {
        return "Class : Account \nBalance : "+getBalance()+"\nMonthly Interest : "+getMonthlyInterest()+"\nDate Created : "+getDateCreated();
    }
}
