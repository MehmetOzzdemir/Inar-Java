package Chapters.Chapter10.Exercises_10_24;

public class MyCharacter {
    private char ch;

    public MyCharacter(char ch) {
        this.ch = ch;
    }

    public char charValue() {
        return ch;
    }

    public static MyCharacter ValueOf(char ch) {
        return new MyCharacter(ch);
    }

    public static int compare(char ch, char ch2) {
        return ch - ch2;
    }

    public int compareTo(MyCharacter cr) {
        return charValue() - cr.charValue();
    }

    public boolean equals(MyCharacter cr) {
        return (compareTo(cr) == 0);
    }

    public static boolean isLetter(char ch) {
        return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
    }

    public static boolean isDigit(char ch) {
        return ('0' <= ch && ch <= '9');
    }

    public static boolean isLetterOrDigit(char ch) {
        return (isLetter(ch) || isDigit(ch));
    }

    public static char toUpperCase(char ch) {
        if (isLetter(ch)) {
            return (char) (ch - 32);
        } else {
            return ch;
        }
    }

    public static char toLowerCase(char ch) {
        if (isLetter(ch)) {
            return (char) (ch + 32);
        } else {
            return ch;
        }
    }

    public static boolean isLowerCase(char ch) {
        return ('a' <= ch && ch <= 'z');
    }

    public static boolean isUpperCase(char ch) {
        return ('A' <= ch && ch <= 'Z');
    }

    @Override
    public String toString() {
        return "MyCharacter{" + "ch=" + ch + '}';
    }
}
