package day17_While_DoWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Aantreman {

    public static void main(String[] args) {

/*

        String str = "AAABBCCCCCD";

        int frequency = 0;

        char letter = 'A';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (letter ==ch){
                frequency++;
            }
        }


        System.out.println(frequency);

*/



        String userName = "Cydeo";
        String passWord = "Cydeo1234";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your userName");
        userName = scan.next();
        System.out.println("Enter your passWord");
        passWord = scan.next();

        if (userName.equals("Cydeo")&&passWord.equals("Cydeo1234")){
            System.out.println("Log in.");
        }else {
            int attempt = 2;
            while(!(userName.equals("Cydeo")&&passWord.equals("Cydeo1234")) && attempt>0){
                System.err.println("Invalid userName or passWord.");
                System.err.println("Please re-enter.");
                System.err.println("Enter your userName");
                userName = scan.next();
                System.err.println("Enter your passWord");
                passWord = scan.next();

                attempt--;

            }

            if (userName.equals("Cydeo")&&passWord.equals("Cydeo1234")){
                System.out.println("Log in.");
            }else {
                System.out.println("Your account has been locked.");
            }

        }



        scan.close();












    }
}
