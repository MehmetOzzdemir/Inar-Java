package Chapters.Chapter10.Exercises_10_03;

public class Exercises_10_03 {
    public static void main(String[] args) {
        MyInteger num =new MyInteger(158786);
        System.out.println(num.getValue());
        System.out.println("isEven() : "+num.isEven());
        System.out.println("isOdd() : "+num.isOdd());
        System.out.println("isPrime() : "+num.isPrime());
        System.out.println("is Equal 10?"+num.equals(10));
        System.out.println("Is Prime Static : "+MyInteger.isPrime(156465));
        char [] arr={'1','2','3'};
        System.out.println("Parse int Char [] : "+MyInteger.parseInt(arr));
        System.out.println("Parse int String : "+MyInteger.parseInt(new String("123")));
    }
}
