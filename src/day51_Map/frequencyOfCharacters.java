package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class frequencyOfCharacters {
    public static void main(String[] args) {


        /*
        Write a program that can return the frequency of characters
         */

/*        String str = "bbcccaaaaa";

        Map<String, Integer> result = new LinkedHashMap<>();

        String[] arr = str.split("");

        for (String each : arr) { // a, b, c
                    // a b c                       [b,b,c,c,c,a,a,a,a,a] a b c
            result.put(each, Collections.frequency(Arrays.asList(arr), each));

        }
        System.out.println(result);*/

        String str = "aaabbbbdddddeeeeee";

        String [] listOfStr = str.split("");

        Map<String,Integer> map = new LinkedHashMap<>();

        for (String each : listOfStr) {
            map.put(each,Collections.frequency(Arrays.asList(listOfStr),each));
        }
        System.out.println("map = " + map);


    }
}
