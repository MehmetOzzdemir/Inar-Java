package Chapters.Chapter11.Exercises_11_02;

import Chapters.Chapter10.Exercises_10_14.MyDate;

public class Employee extends Person{
    private String office;
    private double salary;
    private MyDate hiredDate;

    public Employee(String name,String adress,String phoneNumber,String eMail,String office,double salary,MyDate hiredDate){
        super(name,adress,phoneNumber,eMail);
        this.office=office;
        this.salary=salary;
        this.hiredDate=hiredDate;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getHiredDate() {
        return hiredDate;
    }

    @Override
    public String toString(){
        return "Class : Employee\nName : "+getName()+"\n";
    }
}
