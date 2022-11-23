package Chapters.Chapter11.VolkanHocaExercises.Person;

public class YapiciZinciri {
    public static void main(String[] args) {
        new Academic();
    }
}


class Academic extends Employee {
    public Academic() {

        System.out.println("Academic Worked in University");
    }

}

class Employee extends Person {
    public Employee() {
        this("Call one parameter's Constructor");
        System.out.println("Employee Worked");
    }

    public Employee(String s) {
        System.out.println(s);
    }
}



class Person {
    public Person() {
        System.out.println("Person Worked");
    }
}
