package Chapters.Chapter10.Exercises_10_24;

public class Exercises_10_24 {
    public static void main(String[] args) {
        MyCharacter cr = new MyCharacter('a');
        MyCharacter b= new MyCharacter('b');
        System.out.println(cr);
        System.out.println(b);
        System.out.println(cr.charValue());
        System.out.println(cr.toString());
        System.out.println(MyCharacter.toUpperCase('a'));
        System.out.println(MyCharacter.toLowerCase('B'));
        System.out.println(MyCharacter.isDigit('5'));
        char ch='2';
        System.out.println(MyCharacter.isLetterOrDigit(ch));
        System.out.println(MyCharacter.isLetterOrDigit('+'));
        System.out.println(MyCharacter.toLowerCase('/'));
        System.out.println(MyCharacter.compare('z','a'));
        System.out.println(MyCharacter.compare('z','z'));
        System.out.println(cr.compareTo(b));
        System.out.println(cr.compareTo(new MyCharacter('a')));
        System.out.println(cr.equals(new MyCharacter('b')));


    }
}
