package Chapters.Chapter09.Exercises_09_05;

import java.util.GregorianCalendar;

public class Exercises_09_05 {
    public static void main(String[] args) {
        GregorianCalendar date =new GregorianCalendar();
        System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH)+"/"+date.get(GregorianCalendar.MONTH)+"/"+date.get(GregorianCalendar.YEAR));

        date.setTimeInMillis(1234567898765L);
        System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH)+"/"+date.get(GregorianCalendar.MONTH)+"/"+date.get(GregorianCalendar.YEAR));
    }
}
