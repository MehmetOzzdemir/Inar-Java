package Chapters.Chapter10.Exercises_10_03;

public class MyInteger {
    private int value;


    public MyInteger(int value){
        this.value=value;
    }

    public boolean isEven(){
        if(getValue()%2==0){
            return true;
        }else{
            return false;
        }

    }
    public boolean isOdd(){
        if(!isEven()){
            return true;
        }else{
            return false;
        }
    }

    public boolean isPrime(){
        int number=getValue();
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;

    }
    public static boolean isEven(int number){
        if(number %2 ==0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isOdd(int number) {
        if(!isEven(number)){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
        }

    public static boolean isEven(MyInteger num){
        return isEven(num);
    }
    public static boolean isOdd(MyInteger num){
        return isOdd(num);
    }
    public static boolean isPrime(MyInteger num){
        return isPrime(num);
    }

    public boolean equals(int num) {
        return getValue()==num;
    }
    public boolean equals(MyInteger num){
        return equals(num);
    }
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }
    public static int parseInt(char []arr){
        int num = 0;
        int v;
        for (int i = 0, p = arr.length-1; i <= arr.length - 1; i++, p--) {
            v = arr[i] - '0';
            num += Math.pow(10, p) * v;
        }

        return num;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
