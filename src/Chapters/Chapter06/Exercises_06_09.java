package Chapters.Chapter06;

public class Exercises_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet\t\tMeters\t|\tMeters\t\tFeet");
        System.out.println("--------------------------------------");
       for(double foot=1.0,meters=20.0;foot<=10;foot++,meters+=5.0){
           System.out.println((int)foot+"\t\t\t"+footToMeter(foot)+"\t\t"+meters+"\t\t\t"
                   +meterToFoot(meters));
       }
    }
    public static double footToMeter(double foot){
        return(0.305*foot);
    }
    public static double meterToFoot(double meter){
        return (3.279*meter);
    }
}
