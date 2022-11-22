package Chapters.Chapter10.VolkanHocaExercises;

public class Stack {
    private int[] elements;
    private int numberOfElement;
    private int capacity;

    public Stack() {
        this(20);
    }

    public Stack(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        numberOfElement = 0;
    }

    public void push(int newElements){
        if (isFull()){
            throw new RuntimeException("Stack Full Not have any Area");
        }
        elements[numberOfElement]=newElements;
        numberOfElement++;
    }
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack Have Empty Area");
        }
        numberOfElement--;
         return elements[numberOfElement];
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack Full Not Have Any Area");
        }
        return elements[numberOfElement-1];
    }


    public boolean isEmpty() {
        return numberOfElement == 0;
    }

    public boolean isFull() {
        return numberOfElement == capacity;
    }

    public int getNumberOfElement() {
        return numberOfElement;
    }

}
