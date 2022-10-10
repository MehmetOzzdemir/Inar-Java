package Chapters.Chapter06;

public class Exercises_06_24 {
    public static void main(String[] args) {
        currentTime();
        System.out.print(day()+".");
        System.out.print(month()+".");
        System.out.print(currentYear());

    }
    public static void currentTime() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000L;
        long currentSecond = totalSeconds % 60L;
        long totalMinutes = totalSeconds / 60L;
        long currentMinutes = totalMinutes % 60L;
        long totalHours = totalMinutes / 60L;
        long currentHour = (totalHours+3) % 24L;
        System.out.println(currentHour + ":" + currentMinutes + ":" + currentSecond);
    }
    public static long totalHours() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        return totalMinutes / 60;}
    public static long currentYear() {
        long totalYears = (long) (totalHours() /8765.81277);
        long currentYear = 1970 + totalYears;
        return currentYear;
    }
    public static int day(){
        int day =getTotalNumberOfDays(currentYear(), month())-5;
        return  (day%365)%30;
    }
    public static double millisecondsPerMonth() {
        return 2.63E9;
    }
    public static double millisecondPerYear() {
        return 3.15569E10;
    }
    public static int month() {
        int currentMonth =
                (int)((System.currentTimeMillis() % millisecondPerYear())
                        / millisecondsPerMonth());
        return currentMonth + 1;
    }
    public static int getTotalNumberOfDays(long year,int month){
        int total=0;
        for(int i = 1970;i<year;i++){//toplam yıllardaki günler 1970 yılından itibaren
            if(leapYear(i)){
                total=total+366;
            }
            else{
                total=total+365;
            }
        }
        for (int i = 1; i < month ; i++) {//5 mart dersek marta kadar geçen süre
            total=total+getNumberOfDaysInMonth(year,i);
        }
        return total;
    }
    public static boolean leapYear(long year){
        if(year % 400 == 0 ||(year % 4 ==0 && year % 100 != 0)){
            return true;
        }else{
            return false;
        }
    }
    public static int getNumberOfDaysInMonth(long year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }
        if(month==2){
            if(leapYear(year)){
                return 29;
            }else{
                return 28;
            }
        }
            return 0;
    }
}
