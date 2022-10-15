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
        long currentDays =(totalDays-numberOfLeapYearsSince1970(currentYears))%365-2;
        long month =currentDays/30+1;
        currentDays%=30;

        System.out.println("Current date and time: "+currentDays+ " "+month((int)(month)) +" "+ currentYears
                +" " + currentHours + ":"
                + currentMinutes + ":" + currentSecond );
    }

    public static String month(int num) {

        switch (num){
            case 1:  return "January";
            case 2:  return "February";
            case 3:  return "March";
            case 4:  return "April";
            case 5:  return "May";
            case 6:  return "June";
            case 7:  return "July";
            case 8:  return "August";
            case 9:  return "September";
            case 10:  return "October";
            case 11:  return "November";
            case 12 :return "December";
              default:return null;
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
