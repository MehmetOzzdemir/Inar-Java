package Chapters.Chapter06;

public class Exercises_06_38 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                chPrint(getRandomUpperCase());
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                chPrint(getRandomDigit());
            }
            System.out.println();
        }

    }
    public static char getRandomCharacter(char ch1, char ch2) {
         return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomUpperCase(){
        return getRandomCharacter('A','Z');
    }
    public static char getRandomDigit(){
        return getRandomCharacter('0','9');
    }
    public static void chPrint(char ch1){
        System.out.print(ch1+" ");
    }
}
