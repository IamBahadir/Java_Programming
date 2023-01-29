package day49_Collection;

import java.util.*;

public class SetPractice3 {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.addAll(Arrays.asList(10,10,20,20,30,50,200,17,170,15,150,75));

        System.out.println("integerArrayList = " + integerArrayList);


        integerArrayList = new ArrayList<>( new HashSet<>(integerArrayList) );
        System.out.println("integerArrayList = " + integerArrayList);
        integerArrayList = new ArrayList<>(new LinkedHashSet<>(integerArrayList));
        System.out.println("integerArrayList = " + integerArrayList);
        integerArrayList = new ArrayList<>(new TreeSet<>(integerArrayList));
        System.out.println("integerArrayList = " + integerArrayList);




    }
}
