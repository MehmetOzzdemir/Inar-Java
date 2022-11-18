package Chapters.Chapter09.VolkanHocaExercises;

public class SumArea {
    public static void main(String[] args) {
        Circle [] arr= makeArr();
        printArr(arr);

    }
    private static Circle [] makeArr(){
        Circle [] arr= new Circle[5];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=new Circle(Math.random()*100);
        }
        return arr;
    }
    private static void printArr(Circle []arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].getR()+" and Area : "+arr[i].getArea());
        }
        double sum =sumArea(arr);
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Sum of Area : "+sum);
    }
    private static double sumArea(Circle [] arr){
        double sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i].getArea();
        }
        return sum;
    }
}
