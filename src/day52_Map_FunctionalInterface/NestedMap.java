package day52_Map_FunctionalInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(11, "SDET");
        map1.put(12, "SM");
        map1.put(13, "BA");
        map1.put(14, "Developer");
        map1.put(15, "PO");

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Shay", 100000);
        map2.put("Hulay", 110000);
        map2.put("Veronica", 115000);
        map2.put("Ali", 150000);
        map2.put("Alex", 160000);


        Map<Map<Integer, String>, Map<String, Integer>> mapOfMap = new LinkedHashMap<>();
        mapOfMap.put(map1,map2);

        System.out.println(mapOfMap);

        for (Map.Entry<Map<Integer, String>, Map<String, Integer>> entryMapOfMap : mapOfMap.entrySet()) {
            System.out.println(entryMapOfMap.getKey()+" : "+entryMapOfMap.getValue());
            for (Map.Entry<Integer, String> entryOfKey : entryMapOfMap.getKey().entrySet()) {
                System.out.println(entryOfKey.getKey()+" : "+ entryOfKey.getValue());
            }
            System.out.println("======================");
            for (Map.Entry<String, Integer> entryOfValue : entryMapOfMap.getValue().entrySet()) {
                System.out.println(entryOfValue.getKey()+" : "+entryOfValue.getValue());
            }
        }



    }
}// end line
