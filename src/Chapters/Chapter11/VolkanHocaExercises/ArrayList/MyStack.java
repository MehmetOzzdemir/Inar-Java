package Chapters.Chapter11.VolkanHocaExercises.ArrayList;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> list;
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }
    public Integer peek(){
        return list.get(list.size()-1);
    }
    public Integer pop(){
        Integer number= list.get(list.size()-1);
        list.remove(list.size()-1);

        return number;
    }
    public void push(Integer number){
        list.add(number);
    }

    public static void main(String[] args) {
        MyStack stack =new MyStack();
        stack.peek();
    }
}
