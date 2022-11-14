package Weeks.Weeks_14.Exercises2;

public class Test {
    public static void main(String[] args) {
        Student student1=new Student();

        SchoolStudent student2=new SchoolStudent();
        System.out.println("----------------");
        student2.setAge(45);
        student2.setDayOfAbsance(12);
        student2.setGender("Female");
        student2.setName("Sevgi");
        student2.setClassLevel(12);
        student2.setGradeMean(99.8);
        System.out.println(student2.toSring());
        SchoolStudent student3=new SchoolStudent();
        System.out.println("----------------");
        student3.setDayOfAbsance(30);
        System.out.println(student3.toSring());
        System.out.println("-------------------");
        System.out.println(student1.toString());
    }
}
