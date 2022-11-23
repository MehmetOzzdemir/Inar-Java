package Chapters.Chapter11.VolkanHocaExercises.DynamicBinding;

public class DynamicBinding {
    public static void main(String[] args) {
        Object o =new GraduateStudent();

        Object o1 =new Object();

        if(o1 instanceof GraduateStudent){
            System.out.println("Never got here");
            GraduateStudent gs =(GraduateStudent) o1;
        }
        m(o);
        m(new Student());
        m(new Person1());
        m(new Object());
    }
    public static void m(Object x){
        System.out.println(x.toString());
    }
}


class GraduateStudent extends Student{

}
class Student extends Person1 {
    public String toString(){
        return "Student";
    }
}
class Person1 extends Object{
    public String toString(){
        return "Person";
    }
}