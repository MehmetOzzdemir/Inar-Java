package Chapters.Chapter09.VolkanHocaExercises;

public class TV {
    //Data Field
    private int channel = 1;
    private int volumeLevel=1;
    boolean on =true;

    public TV(){
        this(1,1,false);
    }
    public TV(int channel,int volumeLevel,boolean on){
        this.channel=channel;
        this.volumeLevel=volumeLevel;
        this.on=on;
    }


    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(on&&channel>=1&&channel<=120){
            this.channel=channel;
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(on&&channel>=1&&volumeLevel>0&&channel<=120&&volumeLevel<=40){
            this.volumeLevel = volumeLevel;
        }

    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public void turnOn(){
        on=true;
    }

    public void turnOff(){
        on=false;
    }
}
