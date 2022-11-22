package Chapters.Chapter10.VolkanHocaExercises;

public class Course {
    private String CourseName;
    private String [] students;
    private int studentNumber;
    private static final int MAX_STUDENT=60;

    public Course(String courseName){
        this.CourseName=courseName;
        students=new String[MAX_STUDENT];
        studentNumber=0;
    }
    public void addStudent(String studentName){
        if (studentNumber>=MAX_STUDENT){
            throw new RuntimeException("MAX Student Capacity is 60");

        }
        students[studentNumber]=studentName;
        studentNumber++;



    }

    public void dropStudent(String studentName){
        int index=-1;
        for (int i = 0; i <studentNumber ; i++) {
            if(students[i].equals(studentName)){
                index=i;
                break;
            }
        }
        if(index==-1){
            throw new RuntimeException("Student Not Found");
        }
        for (int i = index; i <students.length-1 ; i++) {
            students[i]=students[i+1];
        }
        studentNumber--;
    }
    public String getCourseName() {
        return CourseName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String[] getStudents() {
        return students;
    }

}
