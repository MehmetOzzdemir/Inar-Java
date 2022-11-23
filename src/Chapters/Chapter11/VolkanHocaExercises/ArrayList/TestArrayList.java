package Chapters.Chapter11.VolkanHocaExercises.ArrayList;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList <String> cityList=new ArrayList<>();

        cityList.add("İzmir");

        cityList.add("Ankara");
        cityList.add("İstanbul");
        cityList.add("Aydın");
        cityList.add("Muğla");


        System.out.println("List Size : "+cityList.size());
        System.out.println("Is İzmir in the List ? "+cityList.contains("İzmir"));
        System.out.println("The Location of Ankara in the list? "+cityList.indexOf("Ankara"));
        System.out.println("Is the list Empty ? "+cityList.isEmpty());

        cityList.add(4,"Denizli");
        System.out.println(cityList);

        cityList.remove(3);
        cityList.remove("Denizli");
        System.out.println(cityList);
        System.out.println("----------");
        for (int i = (cityList.size()-1); i >= 0; i--) {
            System.out.print(cityList.get(i)+" ");
            System.out.println();
        }
    }
}
