package Chapters.Chapter10.Exercises_10_01;

public class Time {
    private int hour;
    private int minute;
    private int second;



    public Time(){
        this(System.currentTimeMillis());
    }
    public Time(long elapsedTime){
        this((int)(elapsedTime/(3600*1000)%24),(int)(elapsedTime/(60*1000)%60),(int)(elapsedTime/(1000)%60));
    }
    public Time(int hour,int minute,int second){
        this.hour=hour+3;//For Turkey Time +3
        this.minute=minute;
        this.second=second;
    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime){
        this.hour=(int)(elapsedTime/(3600*1000)%24);
        this.minute=(int)(elapsedTime/(60*1000)%60);
        this.second=(int)(elapsedTime/(1000)%60);
    }


}
