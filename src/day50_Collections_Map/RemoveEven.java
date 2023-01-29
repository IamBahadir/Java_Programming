package day50_Collections_Map;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEven {
    public static void main(String[] args) {


        // LinkedHashSet maintains the insertion order.

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,100,90,80,75,45,35,25,15));

        System.out.println("set = " + set);

        // if we allow to use the lambda expression

        set.removeIf(p-> p%2==0);

        System.out.println("set = " + set);

        System.out.println("==============================================");

        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,100,90,80,75,45,35,25,15));

        System.out.println("set2 = " + set2);

        Iterator<Integer> i = set2.iterator();

        while(i.hasNext()){

            if (i.next()%2==0){
                i.remove();
            }

        }
        System.out.println("set2 = " + set2);
        System.out.println("==============================================");

        Set<Integer> set3 = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,100,90,80,75,45,35,25,15));

        System.out.println("set3 = " + set3);
        for (  Iterator<Integer> it = set3.iterator() ;it.hasNext();){

            if (it.next()%2==0){
                it.remove();
            }

        }
        System.out.println("set3 = " + set3);


    }
}// end line of the class
