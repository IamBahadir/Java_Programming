package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacter {

    public static void main(String[] args) {

        /*

        1. Write a program that can find the unique characters from a string

        str = "aabcccdeeeef";

        output:
               {b=1, d=1, f=1}
         */

        String str = "aabcccdeeeef";

        String[] array = str.split("");
        String[] array2 = {};

        Map<String, Integer> map = new LinkedHashMap<>();

        System.out.println(Arrays.toString(array));

        String unique = "";

        for (int i = 0; i < array.length; i++) {
            unique = array[i]; // -> a, a, b, c, c, c, d, e, e, e, e, f
            int count = 0;

            for (int x = 0; x < array.length; x++) {
                if (unique.equals(array[x])) {
                    count++;
                }
            }

            if (count == 1) {
                map.put(unique, count);
            }

        }
        System.out.println(map);
        // {b=1, d=1, f=1}


    }
}// end line of the class

