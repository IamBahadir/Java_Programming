package day51_Map;

import java.util.*;

public class IteratingTheMap {


    public static void main(String[] args) {


        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali", 85);
        students.put("Alex", 80);
        students.put("Ozan", 75);
        students.put("Serkan", 70);
        students.put("Andriy", 98);

        System.out.println("========================================");

        System.out.println("students = " + students);

/*
        Set<String> keys = students.keySet();

        for (String each : keys) {
            System.out.println("Keys = " + each+" : "+ students.get(each) );
        }*/

        Map<String, Integer> earlyBirds = new HashMap<>();// we store the students whose score is equal and higher than 90
        Map<String, Integer> angryBirds = new HashMap<>();// we store the students whose score is less than 90

        for (String each : students.keySet()) {

            if (students.get(each) >= 90) {
                earlyBirds.put(each, students.get(each));
            } else {
                angryBirds.put(each, students.get(each));
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("========================================");

        Set<String> keys = students.keySet();
        System.out.println(keys);
        Collection<Integer> values = students.values();
        System.out.println(values);

        System.out.println("========================================");

        Map<String, Integer> minScore = new HashMap<>();
        Map<String, Integer> maxScore = new HashMap<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (Integer eachValue : students.values()) {

            if (eachValue<min){
                min=eachValue;
            }

            if (eachValue>max){
                max = eachValue;
            }

        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("========================================");


        // How many students has the score of 95 or greater

        int count = 0;
        for (Integer eachKeysValue : students.values()) {
            if (eachKeysValue>=95){
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("========================================");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }








    }


}// end line of the class