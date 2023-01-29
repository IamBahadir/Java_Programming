package day48_Collection;

import java.util.*;

public class LıstIntro {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>(); // Upcasting
        list1.addAll(Arrays.asList(10,20,30,40,50));


        List<Integer> list2 = new LinkedList<>(); // Upcasting
        list2.addAll(Arrays.asList(10,20,30,40,50));


        List<Integer> list3 = new Vector<>(); // Upcasting
        list3.addAll(Arrays.asList(10,20,30,40,50));

        List<Integer> list4 = new Stack<>(); // Upcasting
        list4.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);
        System.out.println("list4 = " + list4);

        ((Stack) list4 ).pop(); // Downcasting
        System.out.println("list4 = " + list4);

        if (list4 instanceof Stack){
            System.out.println("Yes it is");
        }else {
            System.out.println("No it is not");
        }


    }
}
