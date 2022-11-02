package Chapters.Chapter07;

public class Exercises_07_23 {
    public static void main(String[] args) {
        boolean[]lockers =new boolean[100];
        for (int student = 1; student<=100; student++) {
            changeLocker(lockers,student);
            }
            display(lockers);
        }


    public static void changeLocker(boolean []lockers,int student){
        for (int i = student-1; i <lockers.length ; i+=student) {
            lockers[i]=!lockers[i];
        }
    }
    public static void display(boolean[]lockers){
        int lockerCount = 0;
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print("L"+ (i+1)+" ");
                lockerCount++;
                if (lockerCount % 10 == 0) System.out.println("");
            }


        }
    }
}
