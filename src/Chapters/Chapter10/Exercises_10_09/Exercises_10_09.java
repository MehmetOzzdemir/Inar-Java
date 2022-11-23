package Chapters.Chapter10.Exercises_10_09;

public class Exercises_10_09 {
    public static void main(String[] args) {
        Course c1 = new Course("Inar Academy Java");
        c1.addStudent("Mehmet Özdemir");
        c1.addStudent("Adil Ömer Alkaya");
        c1.addStudent("Sinan Kartal");
        displayStudents(c1.getStudents(), c1.getNumberOfStudents());

        c1.dropStudent("Sinan Kartal");
        displayStudents(c1.getStudents(), c1.getNumberOfStudents());
    }

    public static void displayStudents(String[] students, int numberOfStudents) {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
    }
}

