package Chapters.Chapter10.Exercises_10_23;

public class Exercises_10_23 {
    public static void main(String[] args) {
        MyString2 a=new MyString2("ADILOMERalkaya");
        System.out.println(a.toUpperCase());
        System.out.println(a.compare("adılomeralkaya"));
        String b="alkaya";
        System.out.println(a.compare(b));
        MyString2 c=a.substring(4);
        System.out.println(c);
        char [] chars = a.toChars();
        for (char ch:chars
             ) {
            System.out.println(ch);
        }
        System.out.println();
        boolean bb=true;
        MyString2 k=MyString2.valueOf(bb);
        System.out.println(k);
        bb=false;
        MyString2 l=MyString2.valueOf(bb);
        System.out.println(l);
    }
}
