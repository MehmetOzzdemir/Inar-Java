package Weeks.Weeks_07;

public class ArrBegin {
    public static void main(String[] args) {
        int [] arr =new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int)(Math.random()*100);
            System.out.printf("%3d",arr[i]);
            if((i+1)%10==0){
                System.out.println();
            }
        }
        int sum =0;
        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println("Array' Sum is : "+sum);
        int lowestNumber=Integer.MAX_VALUE;
        int biggestNumber=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(biggestNumber<arr[i]){
                biggestNumber=arr[i];
            }
            if(lowestNumber>arr[i]){
                lowestNumber=arr[i];
            }
        }
        System.out.println(biggestNumber);
        System.out.println(lowestNumber);

        /*for (int i = 0; i < arr.length ; i++) {
            int randomIndex = (int)(Math.random()* arr.length);
            int temp =arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;

            System.out.printf("%3d",arr[i]);
            if((i+1)%10==0){
                System.out.println();
            }
        }*/
        System.out.println();
        int start =arr[0];

        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[(arr.length-1)]=start;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d",arr[i]);
            if((i+1)%10==0){
                System.out.println();
            }
        }





    }
}
