package Chapters.Chapter06;

public class Exercises_06_16 {
    public static void main(String[] args) {
        System.out.println("Year\t\tDays in Year");
        System.out.println("------------------------");
        for (int year = 2000; year <=2020 ; year++) {
            System.out.println(year + "\t\t" + numberOfDaysInAYear(year));
        }
    }
    public static int numberOfDaysInAYear(int year){
        if(isLeapYear(year)){
            return 366;
        }else {
            return 365;
        }
    }

    public static boolean isLeapYear(int year) {
        if(year%400==0||(year%100!=0 && year%4==0)){
            return true;
        }else{
            return false;
        }
    }
}
