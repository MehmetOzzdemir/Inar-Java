package Chapters.Chapter10.Exercises_10_14;

import java.util.GregorianCalendar;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        this(calendarForTime(elapsedTime).get(GregorianCalendar.DAY_OF_MONTH), calendarForTime(elapsedTime).get(GregorianCalendar.MONTH),
                calendarForTime(elapsedTime).get(GregorianCalendar.YEAR));
    }

    public static GregorianCalendar calendarForTime(long elapsedTime) {
        GregorianCalendar g = new GregorianCalendar();
        g.setTimeInMillis(elapsedTime);
        return g;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar g = calendarForTime(elapsedTime);
        year = g.get(GregorianCalendar.YEAR);
        month = g.get(GregorianCalendar.MONTH);
        day = g.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
