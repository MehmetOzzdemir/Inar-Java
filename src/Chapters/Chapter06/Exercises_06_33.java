package Chapters.Chapter06;

import static Chapters.Chapter06.Exercises_06_16.isLeapYear;

public class Exercises_06_33 {
    public static void main(String[] args) {
        long totalMilliSeconds =System.currentTimeMillis();

        long totalSeconds= totalMilliSeconds/1000;
        long currentSecond=(int)(totalSeconds%60);

        long totalMinutes = totalSeconds/60;
        long currentMinutes =(int )(totalMinutes%60);

        long totalHours = (totalMinutes/60)+3;
        long currentHours =(int)(totalHours%24);

        long totalDays =totalHours/24;

        long currentYears=(int)(totalDays/365)+1970;
        long currentDays =(totalDays-numberOfLeapYearsSince1970(currentYears))%365;



        System.out.println("Current date and time: " + currentYears+ " "+currentDays
                +" " + currentHours + ":"
                + currentMinutes + ":" + currentSecond );

    } public static String dayNameOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            case 1: return "Sunday";
            default: return null;
        }
    }
    public static int numberOfLeapYearsSince1970(long year) {
        int count = 0;
        for (int i = 1970; i <= year; i++) {
            if (isLeapYear(i)){
                count++;
            }
        }
        return count;
    }
}
