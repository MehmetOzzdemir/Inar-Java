package Chapters.Chapter10.Exercises_10_01;

public class Exercises_10_01 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000);
        displayTime(t1);
        displayTime(t2);
        t2.setTime(666666666);
        displayTime(t2);

    }
    public static void displayTime(Time t){
       if(t.getHour()<10){
           System.out.println("0"+t.getHour()+":"+t.getMinute()+":"+t.getSecond());
       }else {

           System.out.println(t.getHour()+":"+t.getMinute()+":"+t.getSecond());
       }
    }
}
