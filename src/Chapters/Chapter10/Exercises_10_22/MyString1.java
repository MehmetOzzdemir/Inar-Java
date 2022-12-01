package Chapters.Chapter10.Exercises_10_22;

import java.util.Arrays;

public class MyString1 {
    private char [] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }
    public char charAt(int index){
        return chars[index];
    }
    public int length1(){
        return chars.length;
    }
    public MyString1 substring(int begin, int end){
        if(begin<0 || end >length1()|| begin>end){
            System.out.println("Invalid Parameters");
            System.exit(1);
        }
        char [] c=new char[end-begin+1];
        for (int indexChars = begin,indexC=0; indexChars <end ; indexChars++,indexC++) {
            c[indexC]=c[indexChars];
            
        }
        return new MyString1(c);
    }
    public MyString1 toLowerCase(){
        char [] c = new char[chars.length];

        for (int i = 0; i <chars.length ; i++) {
            char ch =chars[i];
            if('Z'>=ch && ch>='A'){
                c[i]=(char)(chars[i]+('a'-'A'));
            }else{
                c[i]=chars[i];
            }
        }
        return new MyString1(c);
    }
    public boolean equals(MyString1 s){
        if(s.length1()!=chars.length){
            return false;
        }
        for (int index = 0; index <chars.length ; index++) {
            if(s.charAt(index) != charAt(index)){
                return false;
            }
        }
        return true;
    }
    public static MyString1 valueOf(int i){
        int count =0;
        int number = i;
        while (number>0){
            number/=10;
            count++;
        }
        char [] ch =new char[count];
        for (int index = count-1; index >=0; index--) {
            ch[index]=(char)('0'+i%10);
            i/=10;

        }
        return  new MyString1(ch);
    }

    @Override
    public String toString() {
        return "MyString1{" +
                "chars=" + Arrays.toString(chars) +
                '}';
    }
}
