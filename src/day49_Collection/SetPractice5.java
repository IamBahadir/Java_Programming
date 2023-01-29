package day49_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class SetPractice5 {
    public static void main(String[] args) {


        String str = "aaaabbcccdddddaaabcd";
        String result = ""; // a7b3c4d6 this is the result that I wanna store.

        String[] stringArray = str.split("");

        // using the HashSet is the best way to keep the insertion order. And also we can get the duplicated in the string.

        for (String each : new LinkedHashSet<>(Arrays.asList(stringArray))) { // a, b, c, d

            result += each + Collections.frequency(Arrays.asList(stringArray), each); // a + how many times 'each element' is occurs,

            // a+7+b+3+c+4+d+6
        }

        System.out.println(result);



    }
}
