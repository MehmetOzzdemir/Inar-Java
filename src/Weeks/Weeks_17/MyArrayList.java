package Weeks.Weeks_17;
import java.util.*;
public class MyArrayList {
    public static void main(String[] args) {

    }
    private static Integer min(List list){
        int min=Integer.MAX_VALUE;

        for (int i = 0; i <list.size() ; i++) {
            if((int)list.get(i)<min){
                min=(int)list.get(i);
            }
        }
        return min;
    }

    public static void addRandomValuesToTheList(List list, int i) {
        for (int j = 0; j < i; j++) {
            list.add((int)(Math.random()*10));
        }
    }

    public static void print(List list) {

    }
}
