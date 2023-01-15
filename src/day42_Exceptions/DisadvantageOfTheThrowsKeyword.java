package day42_Exceptions;

public class DisadvantageOfTheThrowsKeyword {

    public static void main(String[] args) {


        System.out.println("Test 1 started");

        System.out.println("Hello");

        // sleep(1); we're getting compile error cause of the throws keyword

        System.out.println("Test 2 started");

        MorningWorkOut.sleep(1);

        System.out.println("Cydeo");







    } // end line of the MAIN method

    public static void sleep(double second) throws InterruptedException{

        Thread.sleep((long)(second*1000));

    } // end line of the SLEEP method


} // end line of the Class
