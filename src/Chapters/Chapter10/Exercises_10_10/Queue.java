package Chapters.Chapter10.Exercises_10_10;

public class Queue {
    private int [] elements;
    private int size;
    private int capacity;

    public Queue(int capacity){
        this.capacity=capacity;
        elements=new int[capacity];
        size=0;
    }
    public Queue(){
        this(8);
    }
    public void enqueue(int v){
        if(size >=elements.length){
            int [] tempElements=new int[elements.length*2];
            System.arraycopy(elements,0,tempElements,0,elements.length);
            elements=tempElements;
        }
        elements[size]=v;
        size++;
    }
    public int dequeue(){
        int n=elements[0];
        for (int i = 1; i <size ; i++) {
            elements[i-1]=elements[i];
        }
        size--;
        return n;
    }
    public boolean empty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }
}
