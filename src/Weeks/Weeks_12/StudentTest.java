package Weeks.Weeks_12;

public class StudentTest {
    public static void main(String[] args) {
        Student mehmet = new Student("Mehmet","Özdemir",4533,"mehmet.ozzdemir@hotmail.com");
        mehmet.print();
        mehmet.setEmail("ahmet uysal@gmail.com");
        mehmet.print();

        Student tarik = new Student();
        tarik.print();
        tarik =new Student("Tarık","Gülbaş",425,"tarikgulbaş@inar.com");
        tarik.print();


    }

}
