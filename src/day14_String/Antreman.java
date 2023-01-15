package day14_String;

public class Antreman {


    public static void main(String[] args) {

                     // 0123456789012345678901
        String email = "Cydeo.School@gmail.com";

        System.out.println(email.indexOf("m")); // 14
        System.out.println(email.indexOf("a")); // 15
        System.out.println(email.indexOf('a')); // 15
        System.out.println(email.indexOf("@")); // 12

        System.out.println("---------------------------");

        System.out.println(email.lastIndexOf(".")); // 18

        System.out.println("----------------------");

        // How can we get the domain name ?

        System.out.println(email.substring(email.indexOf("@")+1,email.lastIndexOf(".")));

        System.out.println("------------------------------------");

        String str = "      bahadir ";
        str = str.trim();
        System.out.println(str);

        System.out.println("------------------------------------");

                  //01234567890123456789012345
        String s = "Java Nova Cava Wawa orange";

        int firstIndexA = s.indexOf("a");
        int secondIndexA = s.indexOf("a No");
        int thirdIndexA = s.indexOf("a C");
        int fourthIndexA = s.indexOf("ava W");
        int fifthIndexA = s.indexOf("a W");
        int sixthIndexA = s.lastIndexOf("aw");
        int seventhIndexA = s.indexOf("a o");
        int eightIndexA = s.lastIndexOf("a");

        System.out.println("eightIndexA = " + eightIndexA); // 22
        System.out.println("seventhIndexA = " + seventhIndexA); //18
        System.out.println("sixthIndexA = " + sixthIndexA);  // 16
        System.out.println("fifthIndexA = " + fifthIndexA);  // 13
        System.out.println("fourthIndexA = " + fourthIndexA);  // 11
        System.out.println("thirdIndexA = " + thirdIndexA);  // 8
        System.out.println("secondIndexA = " + secondIndexA); // 3
        System.out.println("firstIndexA = " + firstIndexA); // 1

        System.out.println("------------------------------------");


        String name = "Bahadir Duskalem";
        name = name.replace("Duskalem","Düzkalem");
        System.out.println(name);
        String longName = "Bahadir Bahadir Bahadir";
        longName = longName.replaceFirst("Bahadir","Duzkalem");
        System.out.println(longName);

        System.out.println("------------------------------------");

        String label = "Prof.";
        String names = "Bahadir";

        System.out.println( (label+" "+names+"\n").repeat(10) );










    }
}
