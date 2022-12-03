package Weeks.Weeks_17;
import java.util.*;

/**
 * 1-Works with Key-Value principle
 * 2-All the keys in a Map moust be Unique
 * JASON FORMAT
 */
public class MyMap {
    public static void main(String[] args) {

        Map<Integer,Integer> map =new HashMap<>();
        map.put(10,48);
        map.put(1,58);
        map.put(2,76);



        String resume="Selenium Java TestNG";
        Set<String>jobDescriptionKeys = new HashSet<>();
        jobDescriptionKeys.add("selenium");
        jobDescriptionKeys.add("testNG");
        jobDescriptionKeys.add("java");

        interviewQuestion(resume,jobDescriptionKeys);
    }


    private static void interviewQuestion(String resume,Set<String> jd){
        Map<String,Integer> map =new HashMap<>();
        String [] resumeArray =resume.toLowerCase().split("\\s");
        for (String word:resumeArray
             ) {
            if(map.containsKey(word)){
                int number=map.get(word);
                map.put(word,number+1);
            }else{
                map.put(word,1);
            }
            System.out.println(Arrays.toString(map.keySet().toArray()));
            System.out.println(Arrays.toString(map.values().toArray()));
        }
        printString(map);
    }


    private static void exampleMap(){
        Map<String,String> InarMap = new HashMap<>();
        InarMap.put("Created Time ","2020");
        InarMap.put("Number Of Student ","42");
        InarMap.put("Instructor ","Tarık");


    }
    private static void print(Map map){
        Set<Integer> set =map.keySet();
        for (Integer key:set) {
            System.out.print(map.get(key)+" ");
        }
    }
    private static void printString(Map map){
        Set<String> set =map.keySet();
        for (String key:set
        ) {
            System.out.println(key+" : "+map.get(key)+" ");

        }
    }

}
