package Chapters.Chapters09.Exercises_09_06;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
        startTime=System.currentTimeMillis();
        endTime=System.currentTimeMillis();
    }
    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void start(){
        startTime=System.currentTimeMillis();
    }
    public void stop(){
        endTime=System.currentTimeMillis();
    }
    public long elapsedTime(){
        return getEndTime()-getStartTime();
    }




}
