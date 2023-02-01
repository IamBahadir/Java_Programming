package day52_Map_FunctionalInterface;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapPractice1 {


    public static void main(String[] args) {

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("Alina", "Developer");
        scrumTeam1.put("Mert", "PO");
        scrumTeam1.put("Lee", "SDET");

        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Anton", "SDET");
        scrumTeam2.put("Muhammed", "Developer");
        scrumTeam2.put("Gulistan", "Developer");
        scrumTeam2.put("Ahmad", "PO");
        scrumTeam2.put("Nevim", "SM");
        scrumTeam2.put("Atakan", "SDET");

        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("YanChun", "BA");
        scrumTeam3.put("Tahir", "Developer");
        scrumTeam3.put("Urantuya", "SM");
        scrumTeam3.put("Veronica", "Developer");
        scrumTeam3.put("Alex", "Developer");
        scrumTeam3.put("Abdulaziz", "Developer");

        Map<String, String> scrumTeam4 = new LinkedHashMap<>();
        scrumTeam4.put("Alim", "PO");
        scrumTeam4.put("Kaiser", "SDET");
        scrumTeam4.put("Alinur", "SDET");
        scrumTeam4.put("Farya", "Develepor");
        scrumTeam4.put("Sherzod", "Developer");
        scrumTeam4.put("Gulsen", "SM");
        scrumTeam4.put("David", "Sdet");

        Map<String, String> scrumTeam5 = new LinkedHashMap<>();
        scrumTeam5.put("Elza", "SDET");
        scrumTeam5.put("Mehmet", "Developer");
        scrumTeam5.put("Stefan", "Developer");
        scrumTeam5.put("Rishat", "PO");
        scrumTeam5.put("Ismail", "SM");
        scrumTeam5.put("Tamara", "SDET");
        scrumTeam5.put("Adnan", "QA");


        // Create a data structure that can store all the given maps above

        List<Map<String, String>> scrumTeams = new ArrayList<>();

        scrumTeams.add(scrumTeam1);
        scrumTeams.add(scrumTeam2);
        scrumTeams.add(scrumTeam3);
        scrumTeams.add(scrumTeam4);
        scrumTeams.add(scrumTeam5);

        System.out.println(scrumTeams);
        System.out.println(scrumTeams.size());


        // Print the name of the all employee

        for (Map<String, String> eachScrumTeam : scrumTeams) {
            for (Map.Entry<String, String> entry : eachScrumTeam.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
        System.out.println("==============================");


        // Print the names of all scrum masters

        for (Map<String, String> eachScrumTeam : scrumTeams) {

            for (Map.Entry<String, String> entry : eachScrumTeam.entrySet()) {

                String sucrumMaster = "SM";
                if (entry.getValue() == sucrumMaster) {
                    System.out.println(entry.getKey());
                }

            }

        }

        System.out.println("==============================");

        // Print the names of all Developers

        for (Map<String, String> eachSucrumTeam : scrumTeams) {
            for (Map.Entry<String, String> entry : eachSucrumTeam.entrySet()) {
                String developer = "Developer";
                if (entry.getValue() == developer) {
                    System.out.println(entry.getKey());
                }

            }
        }



    }

}
