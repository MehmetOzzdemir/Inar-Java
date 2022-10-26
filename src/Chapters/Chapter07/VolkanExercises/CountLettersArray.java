package Chapters.Chapter07.VolkanExercises;

public class CountLettersArray {
    public static void main(String[] args) {
        char [] cArr = randomCharArray();
        printCArr(cArr);
        System.out.println("---------------------------");
        printCArr(StringReverse.reverse(cArr));
        System.out.println("-------------------------");
        int [] count = calculate(cArr);
        printCount(count);

    }

    private static int[] calculate(char[] cArr) {
        int count[]=new int[26];
        for (int i = 0; i <cArr.length ; i++) {
            count[cArr[i]-'a']++;
        }
        return count;
    }

    private static void printCount(int[] count) {
        for (int i = 0; i < count.length; i++) {
            System.out.print((char)('a'+i)+":"+count[i]+" | ");
            if((i+1)%5==0){
                System.out.println();
            }
        }
    }

    public static void printCArr(char[] cArr) {
        for (int i = 0; i <cArr.length ; i++) {
            System.out.print(cArr[i]+" ");
            if((i+1)%10==0){
                System.out.println();
            }
        }
    }

    private static char[] randomCharArray() {
        char [] cArr =new char[100];

        for (int i = 0; i < cArr.length ; i++) {
            cArr[i]= randomChar();
        }

        return cArr;
    }

    private static char randomChar() {
        return (char) ((int) (Math.random() * 26) + 'a');
    }
}
