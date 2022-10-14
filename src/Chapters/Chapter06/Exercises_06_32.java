package Chapters.Chapter06;

public class Exercises_06_32 {
    public static void main(String[] args) {
       Craps(1000);
    }
    public static int sum(int num1,int num2){
        return num1+num2;
    }
    public static void Craps(int count){
        int win=0;
        int lose=0;
        for (int j = 0; j <count ; j++) {
            int num1=(int)(Math.random()*6)+1;
            int num2=(int)(Math.random()*6)+1;
            System.out.printf("You rolled %d+%d = %2d\n",num1,num2,sum(num1,num2));

            int i=0;
        while(i!=1){
            if(num1+num2==2 || num1+num2==3 || num1+num2==12 ){
                System.out.println("You Lose.");
                System.out.println("---------------------");
                i++;
                lose++;
            } else if (sum(num1,num2)==7 ||sum(num1, num2) ==11) {
                System.out.println("You Win.");
                System.out.println("---------------------");
                i++;
                win++;
            }else {
                System.out.println("Point is "+sum(num1, num2));

                int num3=(int) (Math.random()*6)+1;
                int num4=(int) (Math.random()*6)+1;
                System.out.printf("You rolled %d+%d = %2d\n",num3,num4,sum(num3,num4));
                if(num3+num4 ==sum(num1,num2)){
                    System.out.println("You Win.");
                    System.out.println("---------------------");
                    i++;
                    win++;
                } else if (num3+num4 ==7) {
                    System.out.println("You Lose.");
                    System.out.println("---------------------");
                    i++;
                    lose++;
                }
            }
        }
    }
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Win : "+win);
        System.out.println("Lose : "+lose);
        System.out.println("---------------------");
    }
}

