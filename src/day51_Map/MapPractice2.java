package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John",123000);
        map.put("Antony",100000);
        map.put("Jimmy",115000);
        map.put("James",110000);
        map.put("Canar",85000);
        map.put("Josh",117000);
        map.put("Cory",118000);
        map.put("Anderson",125000);
        map.put("Steven",135000);

        /*
            Who has the max salary ?
            Who has the min salary ?
            How many employees has the salary between 120k - 150k ?
            display the name of the employees who are making less than 118k ?
            increase the salary of each employee by 10k
         */




        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            Integer value = eachEntry.getValue();

            if (value > max){
                max = value;
            }

            if (value < min){
                min = value;
            }

        }

        //             Who has the max salary ?
        for (String keys : map.keySet()) {
            if (map.get(keys)==max){
                System.out.println(keys);
            }
        }

        //            Who has the min salary ?
        for (String keys : map.keySet()) {
            if (map.get(keys)==min){
                System.out.println(keys);
            }
        }

        System.out.println("======================================");

        //            How many employees has the salary between 120k - 150k ?
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()>120000 & entry.getValue()<150000 ){
                count++;
            }

        }
        System.out.println(count);
        System.out.println("======================================");


        //            display the name of the employees who are making less than 118k ?

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()<118000){
                System.out.println(entry.getKey());
            }
        }
        System.out.println("======================================");
        //            increase the salary of each employee by 10k


        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            entry.setValue(entry.getValue()+10000);
            System.out.println(entry);
        }







    }



}// end line of the class
