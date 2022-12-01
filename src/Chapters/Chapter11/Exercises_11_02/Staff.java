package Chapters.Chapter11.Exercises_11_02;

import Chapters.Chapter10.Exercises_10_14.MyDate;

public class Staff extends Employee{
    private String tittle;

    public Staff(String name, String adress, String phoneNumber, String eMail, String office, double salary, MyDate hiredDate, String tittle) {
        super(name, adress, phoneNumber, eMail, office, salary, hiredDate);
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    @Override
    public String toString(){
        return "Class : Staff \nName : "+getName()+"\n";
    }
}
