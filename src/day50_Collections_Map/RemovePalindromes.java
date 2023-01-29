package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Python","Cydeo","Car","Level","civic",
                "radar","rotor","kayak","racecar","madam"));

        // We can remove the palindrome from the list instead of using the removeIf() method

        Iterator<String> it = names.iterator();

        while (it.hasNext()){ // --> if the element is existed, it returns true

            String each = it.next(); // if returns true, we can reach the element
            String result = "";

            for (int i = each.length()-1; i >= 0 ; i--) { // we need a condition to reverse the given element
                result += each.charAt(i);

            }

            if (each.equalsIgnoreCase(result)){ // if elements are equal, then we can remove it
                it.remove();
            }

        }

        System.out.println(names);


        System.out.println("================================================");



    }
}// end line of the class
