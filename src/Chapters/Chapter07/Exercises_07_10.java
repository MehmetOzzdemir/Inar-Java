package Chapters.Chapter07;

public class Exercises_07_10 {
    public static void main(String[] args) {
        System.out.print("Enter Ten Numbers : ");
        double []arr =new double[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(int)(((1+Math.random())*10))/10.;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //System.out.print("Minimum Number : "+ Exercises_07_09.min(arr));
        System.out.print("Minimum Number : "+arr[indexOfSmallestElement(arr)]);
        System.out.print("\nMinimum number Index : "+indexOfSmallestElement(arr));
    }
    public static int indexOfSmallestElement(double[] array){
        if(array.length<=1){
            return 0;
        }
        int minIndex=-1;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]<min){
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
