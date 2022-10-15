package Chapters.Chapter06;

import java.util.Scanner;

public class Exercises_06_34 {
    public static void main(String[] args) {
        int dayOfWeek = dayOfWeek();
        String day = "";
        System.out.print("Day of the week is " + dayOfWeekName(dayOfWeek,day));
    }

    public static int dayOfWeek() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year (e.g. 2002)  : ");
        int year = input.nextInt();
        System.out.print("Enter Month (1-12)  : ");
        int month = input.nextInt();
        System.out.print("Enter the day of month (1-31)  : ");
        int dayofMonth = input.nextInt();

        if (month == 1 || month == 2) {
            month = month + 12;
            year = year - 1;
        }
        int century = year / 100;
        int yearOfCentury = year % 100;

        int dayOfWeek = (dayofMonth + (26 * (month + 1) / 10) + (yearOfCentury) + (yearOfCentury / 4) + (century / 4)
                + (5 * century)) % 7;

        return dayOfWeek;
    }

    public static String dayOfWeekName(int dayOfWeek, String day) {
        switch (dayOfWeek) {

            case 0:
                day = "Saturday";
                break;
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;

        }
        return day;
    }

}

