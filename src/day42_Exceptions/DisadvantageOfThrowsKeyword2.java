package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {

    public static void main(String[] args) {

        method1();
        // method2();
    }


    public static void method1(){

        try {
            new FileInputStream("Bahadir");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void method2() throws FileNotFoundException {
        new FileInputStream("Duzkalem");
    }



}
