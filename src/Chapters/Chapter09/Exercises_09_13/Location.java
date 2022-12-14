package Chapters.Chapter09.Exercises_09_13;

public class Location {

    //Data Field
    private int row;
    private int column;
    private double maxValue ;

    public Location(){
        this(0,0,0);
    }

    public Location(int row,int column,double maxValue){
        this.row=row;
        this.column=column;
        this.maxValue=maxValue;
    }


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public String toString(){
        String output;
        output="The location of the largest element is "+getMaxValue()+" at ("+getRow()+","+getColumn()+")";
        return output;
    }




}

