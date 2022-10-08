package Weeks.Weeks_09;

public class ArraySummary2 {
    public static void main(String[] args) {
        int [] cArr=new int[5];

        int sum =sum(cArr);
        System.out.println(sum);
    }
    private static int sum(int [] num1){
        int sum=0;
        for(int sayi:num1){
            sum+=sayi;
        }
        return sum;
    }
}
