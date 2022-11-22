package Chapters.Chapter10.VolkanHocaExercises;

import java.math.*;

public class SarmallayiciSiniflar {
    public static void main(String[] args) {
        System.out.println("Maksimum Integer Value : "+Integer.MAX_VALUE);
        System.out.println(new Double(12.4).intValue());
        System.out.println(new Integer(153).doubleValue());

        System.out.println(new Double(12.4).compareTo(new Double(13.61)));

        Double d1=Double.valueOf("124");
        System.out.println(d1);
        Integer i1=Integer.parseInt("12");
        System.out.println(i1);

        BigInteger b1=new BigInteger(i1+"");
        BigInteger b2 = new BigInteger((i1-1)+"");

        BigInteger b3 =b1.multiply(b2);
        System.out.println(b3);

        b1=new BigInteger("1231313231313213213213132132131321321321");
        b1=b1.multiply(new BigInteger(5+""));
        System.out.println(b1);

        BigDecimal a=new BigDecimal(18.);
        BigDecimal b=new BigDecimal(35);
        BigDecimal c = a.divide(b,20,BigDecimal.ROUND_UP);
        System.out.println(c);
        System.out.println("----------------------");
        System.out.println(factoial(500));
        System.out.println(factoial(500));


    }

    public static BigInteger factoial(long n){
        BigInteger result =new BigInteger("1");
        for (int i = 1; i <=n ; i++) {
        result=result.multiply(new BigInteger(i+""));
        }
        return result;
    }
}
