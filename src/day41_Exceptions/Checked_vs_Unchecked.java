package day41_Exceptions;

public class Checked_vs_Unchecked {

    public static void main(String[] args) throws InterruptedException {


        // unchecked exception

        int a = 10;
        int b = 0;

        // System.out.println(a/b); During the Running time to get a specific exception

        // System.out.println("Wooden Spoon");

        char[] chars = {'A','B','C'};
        // System.out.println(chars[99]); // if you don't handle these exceptions you're not going to run the next code fragment


        // checked Exception

        System.out.println("Hello");

        // Thread.sleep(5000);

        System.out.println("Cydeo");



    }

}
