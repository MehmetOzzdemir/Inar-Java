package Chapters.Chapter06;

public class Exercises_06_30 {
    public static void main(String[] args) {
        int num1=(int)(Math.random()*6)+1;
        int num2=(int)(Math.random()*6)+1;
        System.out.printf("You rolled %d+%d = %2d\n",num1,num2,sum(num1,num2));
        Craps(num1,num2);
    }
    public static int sum(int num1,int num2){
        return num1+num2;
    }
    public static void Craps(int num1,int num2){
        int i=0;
        while(i!=1){
            if(num1+num2==2 || num1+num2==3 || num1+num2==12 ){
                System.out.print("You Lose.");
                i++;
            } else if (sum(num1,num2)==7 ||sum(num1, num2) ==11) {
                System.out.println("You Win.");
                i++;
            }else {
                System.out.println("Point is "+sum(num1, num2));
                System.out.println();
                int num3=(int) (Math.random()*6)+1;
                int num4=(int) (Math.random()*6)+1;
                System.out.printf("You rolled %d+%d = %2d\n",num3,num4,sum(num3,num4));
                if(num3+num4 ==sum(num1,num2)){
                   System.out.println("You Win.");
                    i++;
                } else if (num3+num4 ==7) {
                    System.out.println("You Lose.");
                    i++;
                }
            }
         }
    }
}
