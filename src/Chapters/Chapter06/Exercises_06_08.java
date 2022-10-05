package Chapters.Chapter06;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercises_06_08 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\t\tCelsius");
        System.out.println("----------------------------------------------------------");
    for(double celsius=40.0,fahrenheit=120.0;fahrenheit>=30;celsius--,fahrenheit-=10){
        System.out.println(celsius+"\t\t"+(int)(celsiusToFahrenhait(celsius)*100)/100.+
                "\t\t\t"+fahrenheit+"\t\t\t"+(int)(fahrenheitToCelsius(fahrenheit)*100)/100.);
      // for için ilk iki değeri virgülle ayırıp iki farklı değişken tanımlanabilior
        //ortada tek koşul ve sonda artış azalış olmalı
        //ortada çift koşul divergent oluşturuyor
        }
    }
    public static double celsiusToFahrenhait(double celsius){
        return (9.0/5)*celsius+32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9)*(fahrenheit-32);
    }
}
