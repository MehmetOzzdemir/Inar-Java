package Chapters.Chapter09.VolkanHocaExercises;

public class Student {

    String name;
    int age;
    boolean isScienceMajor;
    char gender;

    public Student() {
        this(null, 0, false, 'M');
    }

    public Student(String name, int age, boolean isScienceMajor, char gender) {
        this.name = name;
        this.age = age;
        this.isScienceMajor = isScienceMajor;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isScienceMajor() {
        return isScienceMajor;
    }

    public void setScienceMajor(boolean scienceMajor) {
        isScienceMajor = scienceMajor;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


}
