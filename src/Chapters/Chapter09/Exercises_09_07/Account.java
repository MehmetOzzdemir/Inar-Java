package Chapters.Chapter09.Exercises_09_07;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    private Date dateCreated;

    public Account(){
        this(0,0,0);
    }
    public Account(int id,double balance,double annualInterestRate){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
        this.dateCreated=new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate(){
        return (getAnnualInterestRate()/100)/12;
    }
    public double getMonthlyInterest(){
        return getMonthlyInterestRate()*getBalance();
    }
    public void withdraw(double withdrawAccount){
        setBalance(getBalance()-withdrawAccount);
    }
    public void deposit(double depositAmount){
        setBalance(getBalance()+depositAmount);
    }


    public String getDateCreated() {
        return dateCreated.toString();
    }
}
