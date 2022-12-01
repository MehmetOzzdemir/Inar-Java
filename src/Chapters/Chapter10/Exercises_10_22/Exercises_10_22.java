package Chapters.Chapter10.Exercises_10_22;

public class Exercises_10_22 {
    public static void main(String[] args) {
        MyString1 a= new MyString1(new char[]{'O','M','E','R'});
        System.out.println(a.toString());
        MyString1 b=a.toLowerCase();
        System.out.println(b);
        MyString1 c =a.substring(1,3);
        System.out.println(c);
        System.out.println(a.equals(b));
        System.out.println(c.length1());
        MyString1 d = new MyString1(new char[]{'O','M','E','R'});
        System.out.println(d.equals(a));
        MyString1 e = MyString1.valueOf(71365);
        System.out.println(e);
    }
}
