package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {


        Map<String, String> employeeMap = new HashMap<>();

        employeeMap.put("Ddene","F");
        employeeMap.put("Winfred","M");
        employeeMap.put("Jereme","M");
        employeeMap.put("Glad","F");
        employeeMap.put("Desirae","F");
        employeeMap.put("Kakalina","F");
        employeeMap.put("Bertrando","M");
        employeeMap.put("Ajay","F");
        employeeMap.put("Brigitte","F");
        employeeMap.put("Derk","M");
        employeeMap.put("Orlando","M");
        employeeMap.put("Selle","F");
        employeeMap.put("Marika","F");

        // update the 'M' to Male and 'F' to Female

        System.out.println("employeeMap = " + employeeMap);


        System.out.println("============================================");

/*        for (String keys : employeeMap.keySet()) {
            if (employeeMap.get(keys)=="F"){
                employeeMap.replace(keys,"Female");
            }
            if (employeeMap.get(keys)=="M"){
                employeeMap.replace(keys,"Male");
            }

        }

        System.out.println(employeeMap);*/ // this is another implementation that we can use it.

        System.out.println("============================================");


        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {

            if (eachEntry.getValue() =="F"){
                eachEntry.setValue("Female");
            }
            if (eachEntry.getValue() == "M"){
                eachEntry.setValue("Male");
            }
            System.out.println(eachEntry);

        }




        System.out.println("============================================");

        // Display the names of all female employees

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue()=="Female"){
                System.out.println(eachEntry.getKey());
            }
        }

        System.out.println("============================================");



    }
}// end line of the class
