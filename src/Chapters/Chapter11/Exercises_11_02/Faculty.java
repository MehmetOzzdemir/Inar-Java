package Chapters.Chapter11.Exercises_11_02;

import Chapters.Chapter10.Exercises_10_14.MyDate;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String adress, String phoneNumber, String eMail, String office, double salary, MyDate hiredDate, String officeHours, String rank) {
        super(name, adress, phoneNumber, eMail, office, salary, hiredDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Class : Faculty \nName"+getName()+"\n";
    }
}
