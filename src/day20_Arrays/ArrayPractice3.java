package day20_Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt();
        int attempt = 2;
        while (length <= 0 && attempt > 0) {
            System.err.println("Valid Number, please re-enter again!");
            length = scan.nextInt();
            attempt--;

            if (attempt==0){
                System.err.println("You did not enter any numbers.");
                System.exit(0);
            }
        }

        int[]numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number.");
            numbers[i]= scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));




    }

}
