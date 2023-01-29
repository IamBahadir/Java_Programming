package day50_Collections_Map;

import java.util.*;

public class IterablePractice2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercan", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yulia", "Chris"));

        System.out.println("names = " + names);
        // remove all the names "ahmed"

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {

            if (it.next().equalsIgnoreCase("ahmed")) {
                it.remove();
            }

        }
        System.out.println("names = " + names);

        System.out.println("===================================");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercan", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yulia", "Chris"));
        System.out.println("names2 = " + names2);

        for (Iterator<String> i = names2.iterator(); i.hasNext(); ) {

            if (i.next().equalsIgnoreCase("ahmed")) {
                i.remove();
            }

        }
        System.out.println("names2 = " + names2);
        System.out.println("===================================");

        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercan", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yulia", "Chris"));

        System.out.println("names3 = " + names3);

        names3.removeIf(p -> p.equalsIgnoreCase("ahmed"));

        System.out.println("names3 = " + names3);


    }
}// end line of the class
