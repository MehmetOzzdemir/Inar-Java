package Chapters.Chapter10.VolkanHocaExercises;

public class TestStack {
    public static void main(String[] args) {
        Stack s1= new Stack();

        System.out.println("Add Elements : ");
        for (int i = 0; i <10 ; i++) {
            s1.push(i);
        }
        System.out.println(s1.peek());
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
            while ((!s1.isEmpty())){
                System.out.print(s1.pop()+" ");
            }



        }
    }

