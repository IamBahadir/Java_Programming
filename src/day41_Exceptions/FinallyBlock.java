package day41_Exceptions;

public class FinallyBlock {


    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5};


        try {
            System.out.println(numbers[10]);
        }catch (RuntimeException e){
            System.out.println("Catch block");
            e.printStackTrace();
            // System.exit(0); This is the only way that finally block doesn't get executed.
        }finally {
            System.out.println("Finally Block"); // That is always get executed.
        }


        /*
        Interview question:
        final ,   finally , finalize
        keyword - Block   - Method

        Interview question ;

        // System.exit(0); This is the only way that finally block doesn't get executed.


        Finally block always get executed regardless of exception is being handled or not handled.

        There is only one way that finally block doesn't executed that is System.exit(status.0)

         */





    }

}
