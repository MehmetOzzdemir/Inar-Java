package Chapters.Chapters09.Exercises_09_02;

public class Exercises_09_02_Test {
    public static void main(String[] args) {
            Stock stock1=new Stock();
            stock1.setName("Oracle Operation");
            stock1.setSymbol("ORCL");
            stock1.setCurrentPrice(34.5);
            stock1.setCurrentPrice(34.35);
            stock1.print();
            System.out.println("Change Percent : "+stock1.getChangePercent());

    }
}
