package day15_ForLoop;

import java.util.Scanner;

public class AAntreman {

    public static void main(String[] args) {

        for (int i = 90; i >= 65 ; i--) {
            System.out.print((char) i);
        }
        System.out.println();
        for (int i = 122; i >=97 ; i--) {

            System.out.print((char) i);
        }
        System.out.println();
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i);
        }
        System.out.println();
        for (int i = 65; i <=90 ; i++) {
            System.out.print((char) i);
        }

        System.out.println();

        System.out.println("****************************************");

        String firstName = "BAHADIR";
        String lastName  = "DÜZKALEM";

        firstName = firstName.substring(firstName.indexOf("B"),1).toUpperCase()+""+firstName.substring(firstName.indexOf("A")).toLowerCase();
        lastName = lastName.substring(lastName.indexOf("D"),1).toUpperCase()+""+lastName.substring(lastName.indexOf("Ü")).toLowerCase();
        String fullName = firstName+" "+lastName;

        System.out.println(fullName);


        System.out.println("****************************************");

        Scanner scan = new Scanner(System.in);

        System.out.println("How many time do you enter a number ? ");
        int iteration = scan.nextInt();

        int num =0;
        int max = -999999999;
        int min =  999999999;
        for (int i = 0; i < iteration; i++) {
            System.out.println("Enter a number");
            num = scan.nextInt();

            if (max<num){
                max = num;
            }else {
                min=num;
            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);




    }
}
