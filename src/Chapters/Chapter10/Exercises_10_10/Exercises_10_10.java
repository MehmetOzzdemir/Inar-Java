package Chapters.Chapter10.Exercises_10_10;

public class Exercises_10_10 {
    public static void main(String[] args) {
        Queue q1=new Queue();
        for (int i = 0; i <=50 ; i++) {
            q1.enqueue(i);
        }
        int size = q1.getSize();
        int count = 0;
        for (int i = 0; i <size ; i++) {
            System.out.printf("%-3d",q1.dequeue());
            count++;
            if(count%5==0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
