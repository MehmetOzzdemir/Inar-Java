package Weeks.Weeks_07;

public class ReturningArray {
    public static void main(String[] args) {
        int []arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100);
            System.out.print(arr [i]+" ");
        }
        System.out.println();
        reverse(arr);
    }
    public static void reverse (int [] list){
        int [] reverse = new int [list.length];
        int count=0;
        for (int i = reverse.length-1 ; i >=0;i--) {
            reverse[count]=list[i];
            System.out.print(reverse [count]+" ");
            count++;
        }
    }
}
