package Chapters.Chapter07.VolkanExercises;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,8,10,15,356,15,58};
        selectionSort(arr);
        for (int d:arr) {
            System.out.print(d+" ");

        }
    }
    public static void selectionSort(int [] list){
        for (int i = 0; i < list.length-1 ; i++) {
            double min =list[i];

            int minIndex=i;

            for (int j = i+1; j < list.length ; j++) {
                if(min>list[j]){
                    min=list[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                list[minIndex]=list[i];
                list[i]= (int) min;

            }

        }
    }
}
