package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.TreeMap;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test_1 started");
        System.out.println("<------------------->");

        try {

            System.out.println(9 / 0);
            System.out.println("Try Block");

        } catch (ArithmeticException e) {

            System.out.println("Catch Block.");
            System.out.println("Arithmetic Exception was occurred.");
        }

        System.out.println("<------------------->");

        System.out.println("Test_1 Completed");

        System.out.println("<------------------->");
        System.out.println("<------------------->");


        System.out.println("Test_2 Started.");

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("<------------------->");


        try {

            System.out.println(numbers[100]);
            System.out.println("Try Block");

        } catch (RuntimeException e) { // ArrayIndexOutOfBoundsException (child of Runtime)

            // e.printStackTrace(); it gives me the variety of Compile error after the last block occurred.

            System.out.println(e.getMessage());
            /*
            System.out.println("Catch Block");
            System.out.println("Runtime Exception was occurred.");
             */
        }
        System.out.println("<------------------->");


        System.out.println("Test_2 completed.");

        System.out.println("<------------------->");
        System.out.println("<------------------->");

        System.out.println("Test_3 started.");

        System.out.println("<------------------->");


        try {
            System.out.println("Cydeo".substring(2,0));

        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("<------------------->");


        System.out.println("Test_3 completed.");

        System.out.println("<------------------->");
        System.out.println("<------------------->");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("<------------------->");

        try {
            FileInputStream file = new FileInputStream("File");
        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }





    }



}
