package Weeks.Weeks_10;


public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] arr =new int[2][5];
        printArr(arr);
        System.out.println("----------------");
        System.out.println("arr.lentgth = "+arr.length);
        System.out.println("arr[0].lentgth = "+arr[0].length);
        System.out.println("arr[1].lentgth = "+arr[1].length);

        int [][] barr =new int[2][];
        barr[0]=new int[3];
        barr[1]=new int[7];
        printArr(barr);
    }

    public static void printArr(int[][] arr) {
        System.out.println("-----------------");
        for (int satır = 0; satır < arr.length ; satır++) {
            for (int sutun = 0; sutun <arr[satır].length ; sutun++) {
                System.out.printf(" [%3d] ",arr[satır][sutun]);
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
    public static void fill2DArrWithRandomValues(int [][]arr,int start,int limit){
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length ; column++) {
                arr[row][column]= (int)(Math.random()*(limit-start)+start);
            }
        }
    }
}
