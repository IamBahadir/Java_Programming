package day49_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractice4 {
    public static void main(String[] args) {


        String str = "aaaabbbbccccdddeeeee";
        String result = "";//abcde

        String [] strings = new String[str.length()];

        for (int x = 0, i = 0; x < strings.length; x++,i++) {
            strings[x] = ""+str.charAt(i);
        }

        System.out.println(Arrays.toString(strings));

        ArrayList<String> stringArrayList = new ArrayList<>( Arrays.asList(strings) );

        stringArrayList = new ArrayList<>( new TreeSet<>(stringArrayList));

        System.out.println(stringArrayList);


        System.out.println("------------------------------------------------------");

        strings = new LinkedHashSet<>(Arrays.asList(strings)).toArray(new String[0]);

        System.out.println(Arrays.toString(strings));




    }
}
