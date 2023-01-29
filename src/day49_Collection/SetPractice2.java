package day49_Collection;

import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {



        String [] arr = {"Wooden Spoon","Book","Pen","Phone",
                "Wooden Spoon","Wooden Spoon","Wooden Spoon","Wooden Spoon","Milk","Eggs","Coke","Paper towels"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr));

        arr = set1.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println(set1);

        System.out.println("-----------------------------------------------");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(100,100,200,200,300,500,150,150,250,350,45,450));
        System.out.println("arrayList = " + arrayList);

        Integer[] list = arrayList.toArray(new Integer[0]);

        System.out.println("list : "+ Arrays.toString(list));

        Set<Integer> hashSet = new HashSet<>(Arrays.asList(list));
        System.out.println(hashSet);

        list = hashSet.toArray(new Integer[0]);

        System.out.println("list : "+ Arrays.toString(list));

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(list));

        list = linkedHashSet.toArray(new Integer[0]);

        System.out.println("list : "+ Arrays.toString(list));

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(list));
        list = treeSet.toArray(new Integer[0]);

        System.out.println("list : "+ Arrays.toString(list));



    }
}
