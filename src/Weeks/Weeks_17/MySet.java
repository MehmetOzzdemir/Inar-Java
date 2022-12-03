package Weeks.Weeks_17;


import java.util.*;

public class MySet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        addRandomValuesToTheList(set,150);


        System.out.println(set.size());
        print(set);
    }

    public static void addRandomValuesToTheList(Set set, int i) {
        for (int j = 0; j < i; j++) {
          set.add((int)(Math.random()*10));
        }
    }

    private static void print(Set set) {
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(set.toArray()));
    }
}
