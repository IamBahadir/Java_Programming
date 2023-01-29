package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        // student name and score

        Map<String , Integer> students = new HashMap<>();


        students.put("Marty",100);
        students.put("Misty",90);
        students.put("Matt",55);
        students.put("Bahadır",101);
        students.put("Kalbinur",1);


        System.out.println("students = " + students);
        System.out.println("students.size() = " + students.size());


        System.out.println("====================================");
        // get() -> display the value of key

        // display the score of Bahadır
        System.out.println("students.get(\"Bahadır\") = " + students.get("Bahadır"));

        System.out.println("====================================");
        // replace() -> change the value you want

        students.replace("Marty",50);
        students.replace("Kalbinur",11);
        System.out.println("students = " + students);


        System.out.println("====================================");
        // remove() -> remove the element you want


        students.remove("Marty");
        students.remove("Kalbinur");

        System.out.println("students = " + students);
        System.out.println("students.size() = " + students.size());


        System.out.println("====================================");
        //containsKey() -> it returns boolean


        System.out.println("students.containsKey(\"Matt\") = " + students.containsKey("Matt"));
        System.out.println("students.containsKey(\"Bahadır\") = " + students.containsKey("Bahadır"));
        System.out.println("students.containsKey(\"Misty\") = " + students.containsKey("Misty"));
        System.out.println("students.containsKey(\"Kalbinur\") = " + students.containsKey("Kalbinur"));



        System.out.println("====================================");
        // containsValue() -> it returns boolean

        System.out.println("students.containsValue(101) = " + students.containsValue(101));
        System.out.println("students.containsValue(0) = " + students.containsValue(0));

        System.out.println("====================================");
        //isEmpty() -> it returns boolean

        System.out.println("students.isEmpty() = " + students.isEmpty());


        System.out.println("====================================");
        //equals() -> it returns boolean

        Map<String,Integer> map1 = new HashMap<>();
        map1.putAll(students);
        Map<String,Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1.equals(map2) = " + map1.equals(map2));

        System.out.println("====================================");

        System.out.println("map1 = " + map1);
        map1.clear();
        System.out.println("map1 = " + map1);



        System.out.println("map2.equals(map1) = " + map2.equals(map1));
        //clear() -> clear all keys and values

        System.out.println("====================================");
        //putAll() -> Put the map, which has already existed, on another map.


        System.out.println("====================================");
        // keySet() -> display keys of map

        System.out.println("students.keySet() = " + students.keySet());

        System.out.println("====================================");
        // values() -> display values of map

        System.out.println("students.values() = " + students.values());


        System.out.println("====================================");
        //entrySet()

        System.out.println("students.entrySet() = " + students.entrySet());



    }
}// end line of the class
