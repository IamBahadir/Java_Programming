package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("------ Push up started");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush up " + i);

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("\n------ Push ups completed");

        System.out.println("------ Pull up started");
        for (int i = 1; i <= 30; i++) {

            System.out.print("\rPush up " + i);
            sleep(1.7);

        }
        System.out.println("\n------ Pull ups completed");


    } // end line of the Main method

    public static void sleep(double second) {

        try {
            Thread.sleep((long) second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

} // end line of the Class
