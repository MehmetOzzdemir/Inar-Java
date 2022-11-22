package Chapters.Chapter10.Exercises_10_05;

public class StackOfIntegers {
    private int number;
    private int [] elements;
    private int size;


    public StackOfIntegers(int capacity) {
        elements=new int[capacity];
    }


    public boolean isEmpty(){
        return size==0;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }




}
