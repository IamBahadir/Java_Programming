package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        System.out.println("====================================");

        //  Key      Value
        Map<Integer, String> hashMap = new HashMap<>();

        // maintains random order
        // it accepts/supports null value
        hashMap.put(10,"Bahadır");
        hashMap.put(20,"Bahadır");
        hashMap.put(30,"Bahadır");
        hashMap.put(40,"Bahadır");
        hashMap.put(50,"Bahadır");
        hashMap.put(null,"Bahadır2");
        hashMap.put(null,"Bahadır3");
        hashMap.put(null,"Bahadır4");
        hashMap.put(null,"Bahadır5");

        System.out.println("hashMap = " + hashMap);
        System.out.println("====================================");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // maintains insertion order
        // it accepts/supports null value
        linkedHashMap.put(10,"Bahadır");
        linkedHashMap.put(20,"Bahadır");
        linkedHashMap.put(30,"Bahadır");
        linkedHashMap.put(40,"Bahadır");
        linkedHashMap.put(50,"Bahadır");
        linkedHashMap.put(null,"Bahadır2");
        linkedHashMap.put(null,"Bahadır3");
        linkedHashMap.put(null,"Bahadır4");

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("====================================");

        Map<Integer, String> treeMap = new TreeMap<>();

        // maintains sorted (Ascending) order
        // it doesn't accept/support null value
        treeMap.put(20,"Bahadır");
        treeMap.put(10,"Bahadır");
        treeMap.put(50,"Bahadır");
        treeMap.put(40,"Bahadır");
        treeMap.put(30,"Bahadır");
        /*
        treeMap.put(null,"Bahadır2");
        treeMap.put(null,"Bahadır3");
        treeMap.put(null,"Bahadır4");

         */ // null values

        System.out.println("treeMap = " + treeMap);


        System.out.println("====================================");

        Map<Integer, String> hashtable = new Hashtable<>();

        // it doesn't accept/accept null values
        // maintains the random order
        // synchronized (Thread-Safe)

        hashtable.put(50,"Bahadır");
        hashtable.put(20,"Bahadır");
        hashtable.put(30,"Bahadır");
        hashtable.put(40,"Bahadır");
        hashtable.put(10,"Bahadır");


        /*
        hashtable.put(null,"Bahadır2");
        hashtable.put(null,"Bahadır3");
        hashtable.put(null,"Bahadır4");

         */ // null values

        System.out.println("hashtable = " + hashtable);

        System.out.println("====================================");
    }

}
