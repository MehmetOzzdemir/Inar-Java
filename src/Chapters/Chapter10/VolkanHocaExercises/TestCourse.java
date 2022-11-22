package Chapters.Chapter10.VolkanHocaExercises;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 =new Course("Data Structures");

        Course course2 =new Course("Data Systems");

        course1.addStudent("Mehmet");
        course1.addStudent("Ahmet");
        course1.addStudent("Ali");

        course2.addStudent("Tarık");
        course2.addStudent("Yusuf");

        System.out.println("Number of Students in Course 1 : "+course1.getStudentNumber());
        String [] students =course1.getStudents();
        for (int i = 0; i <course1.getStudentNumber() ; i++) {
            System.out.println(students[i]);

        }
        System.out.println();

    }
}
