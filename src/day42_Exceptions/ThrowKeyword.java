package day42_Exceptions;

import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age>21){
            System.out.println("You are eligible");
        }else {
            throw new RuntimeException("You must be at least 21 years old");
        }



    }
}
