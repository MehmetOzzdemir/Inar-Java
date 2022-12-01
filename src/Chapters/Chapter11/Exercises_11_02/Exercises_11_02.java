package Chapters.Chapter11.Exercises_11_02;

import Chapters.Chapter10.Exercises_10_14.MyDate;

public class Exercises_11_02 {
    public static void main(String[] args) {
        Person person =new Person("Adil Ömer Alkaya","Göz Göz Göztepe","053535353535","adilomeralkaya@gmail.com");
        Student student = new Student("Arda Üstün","gaziemir","34322343234","arda@gmail.com",Student.JUNIOR);
        Employee employee =new Employee("ali alkaya","gaziemir","324223423","alialkaya@gmail.com","Bozşahinler",1000000,new MyDate());
        Faculty faculty =new Faculty("mehmet özdemir","izmir","5445454544","mehmet.ozzdemir@hotmail.com","Monster",10000,new MyDate(),"7/24","Master");
        Staff staff =new Staff("Mete","Kemalpaşa","5656565656","mete@gmail.com","göztepe",1231,new MyDate(),"boss");
        System.out.println(person);
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
