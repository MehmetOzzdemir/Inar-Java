package Chapters.Chapter09.VolkanHocaExercises;

public class TVTest {
    public static void main(String[] args) {
        TV tv1=new TV();
        tv1.turnOn();
        tv1.setChannel(6);
        tv1.setVolumeLevel(23);
        System.out.println("This Tv's Channel : "+tv1.getChannel()+"\nThis Volume : "+tv1.getVolumeLevel());
        System.out.println("-----------------------------");
        TV tv2=new TV(7,26,true);
        System.out.println("This Tv's Channel : "+tv2.getChannel()+"\nThis Volume : "+tv2.getVolumeLevel());
    }
    }

