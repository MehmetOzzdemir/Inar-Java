package Chapters.Chapter10.Exercises_10_09;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        // If the size exceeds the capacity doubled the capacity
        if (numberOfStudents >= students.length) {
            String[] tempStudent = new String[students.length * 2];
            System.arraycopy(students, 0, tempStudent, 0, students.length);
            students = tempStudent;
        }
        // Adds student and increase the capacity
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int index = findTheSpecifiedStudent(student);
        // Look for student if he/she doesn't exist prompt that line 42
        if (index == -1) {
            System.out.printf("There aren't any student named %s int this course.\n", student);
            return;
        }

        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
        numberOfStudents--;
    }

    public int findTheSpecifiedStudent(String student) {
        // Finds the location of the specified student
        for (int i = 0; i < students.length; i++) {
            if (student.equals((students[i]))) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        // clear that course
        students = new String[100];
        numberOfStudents = 0;

    }
}
