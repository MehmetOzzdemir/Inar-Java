package Chapters.Chapter06;

public class Exercises_06_12 {
    public static void main(String[] args) {
        int perLine=10;
        char ch1='1';
        char ch2='Z';
        System.out.println("The Characters For between 1 to Z : ");
        printChars(ch1,ch2,perLine);
        System.out.println();
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int count=0;
        for(char c=ch1;c<=ch2;c++){
            count++;
            if(count%numberPerLine==0){
                System.out.println(c);
            }else{
                System.out.print(c+" ");
            }
        }
    }
}
