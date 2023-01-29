package day49_Collection;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {


        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        System.out.println(hashSet);
        hashSet.add(30);
        hashSet.add(40);
        System.out.println(hashSet);
        hashSet.addAll(Arrays.asList(20, 40, 10, 30)); // it does not allow duplicated
        System.out.println(hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.addAll(Arrays.asList(10, 20, 30, 40));
        System.out.println("linkedHashSet = " + linkedHashSet);
        linkedHashSet.add(null);
        System.out.println("linkedHashSet = " + linkedHashSet);
        linkedHashSet.addAll(Arrays.asList(20, 40, 10, 30)); // it does not allow duplicated
        System.out.println("linkedHashSet = " + linkedHashSet);


        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(100, 300, 250, 50));
        treeSet.addAll(Arrays.asList(100, 300, 250, 50));

        System.out.println("treeSet = " + treeSet);

        // treeSet.add(null);
        // System.out.println("treeSet = " + treeSet); // it does not accept the null value


    }
}
