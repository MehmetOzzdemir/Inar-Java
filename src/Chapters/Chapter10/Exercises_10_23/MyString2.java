package Chapters.Chapter10.Exercises_10_23;

import java.util.Arrays;

public class MyString2 {
    private char [] chars;

    public MyString2(String s){
        chars=s.toCharArray();
    }
    public MyString2(char[] chars) {
        this.chars = chars;
    }
    public int compare(String s){
        int count=0;
        int count1=0;
        while (count1<chars.length && count<s.length()){
            if(chars[count1] != chars[count]){
                return s.charAt(count)-chars[count1];
            }
            count1++;
            count++;
        }
        if(count1== chars.length && count==s.length()){
            return 0;
        } else if (count1== chars.length) {
            return -1;
        }else {
            return 1;
        }
    }
    public MyString2 substring(int begin){
        if(begin<0 || begin>= chars.length){
            System.out.println("Invalid begin Index !");
            System.exit(1);
        }
        char [] ch =new char[chars.length-begin];
        for (int i = begin,startIndex=0; i < chars.length ;startIndex++, i++) {
            ch[startIndex]=chars[i];

        }
        return new MyString2(ch);
    }

    public MyString2 toUpperCase(){
        char [] c=new char[chars.length];

        for (int index = 0; index < chars.length; index++) {
            char ch = chars[index];
            if ('z' >= ch && ch >= 'a') {
                c[index] = (char) (chars[index] - ('a' - 'A'));
            } else {
                c[index] = chars[index];
            }
        }
        return new MyString2(c);
    }

    public char [] toChars(){
        return chars;
    }
    public static MyString2 valueOf(boolean b){
        return new MyString2(b?"true":"False");
    }

    @Override
    public String toString() {
        return "MyString2{" +
                "chars=" + Arrays.toString(chars) +
                '}';
    }
}
