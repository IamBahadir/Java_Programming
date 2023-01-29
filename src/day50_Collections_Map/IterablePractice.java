package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        // remove all the elements that are less than 4

        /*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<4){
                list.remove(i);
            }
        }
        System.out.println(list);// because of the ArrayList is dynamic
         */

        Iterator<Integer> it = list.iterator();

        // hasNext() = if there is an element in the list of the iterator that gives us true.
        // Next()    = it shows us the element.

        /*
        boolean r1 = it.hasNext();
        System.out.println("r1 = " + r1);
        System.out.println("it.next() = " + it.next());
        boolean r2 = it.hasNext();
        System.out.println("r2 = " + r2);
        System.out.println("it.next() = " + it.next());

         */

        System.out.println("=========================================");


        while (it.hasNext()) { // if it has an element, it returns true

            if (it.next() < 4) {

                it.remove();
            }

        }

        // this is how we remove the element that are less than 4
        System.out.println("list = " + list);

        System.out.println("=========================================");

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        // to be able to remove the element that are less than 4 by using for loop
        // First, inside the for loop, we should call the iterator() method.


        for (Iterator<Integer> i = list1.iterator(); i.hasNext(); ) {

            if (i.next() < 4) {
                i.remove();
            }
        }

        System.out.println("list1 = " + list1);

        System.out.println("=========================================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        // what is the best way is to be able to remove all the element that are less than 4
        // by using removeIf() method

        list2.removeIf(each -> each < 4);

        System.out.println("list2 = " + list2);

        System.out.println("=========================================");




    }
}// end line of the class
