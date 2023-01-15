package day43_Abstraction;

import java.util.Scanner;

public class Throw_vs_Throws {
    public static void main(String[] args) {


        System.out.println("Enter your score: ");

        int score = new Scanner(System.in).nextInt();


        if (!(0<=score & score<=100)){
            throw new RuntimeException("Invalid score :"+score);
        }else {
            System.out.println("score = " + score);
        }



    }
}
