package Chapters.Chapter11.VolkanHocaExercises.GeometricObject;

import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean full;
    private Date createTime;

    public GeometricObject(){
        this.color="White";
        createTime=new Date();
    }
    public GeometricObject(String color,boolean full){
        this();
        this.color=color;
        this.full=full;
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString(){
        return "create on "+createTime+"\nColor : "+color+" and filled "+full;
    }


}
